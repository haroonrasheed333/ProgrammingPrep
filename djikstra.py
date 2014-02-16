__author__ = 'Vaidyanath'


class Graph:

    def __init__(self):
        self.nodes = set()
        self.edges = {}
        self.distances = {}

    def addEdge(self, from_node, to_node,distance):
        self.edges.setdefault(from_node, [])
        self.edges[from_node].append(to_node)
        self.distances[(from_node, to_node)] = distance
        self.edges.setdefault(to_node,[])
        self.edges[to_node].append(from_node)
        self.distances[(to_node, from_node)] = distance

    def addNode(self, node):
        self.nodes.add(node)


def dijkstra(graph, initial_node):
    visited = {initial_node: 0}
    nodes = set(graph.nodes)
    current_node = initial_node

    path = {}

    while nodes:
        min_node = None
        for node in nodes:
            if node in visited:
                if min_node is None:
                    min_node = node
                elif visited[node] < visited[min_node]:
                    min_node = node
        if min_node is None:
            break

        nodes.remove(min_node)
        cur_wt = visited[min_node]

        for edge in graph.edges[min_node]:
            wt = cur_wt + 1  #graph.distances[(min_node,edge)]
            if edge not in visited:  #or wt < visited[edge]:
                visited[edge] = wt
                path[edge] = min_node

    return visited, path

def astar(graph, initial_node, goal_node, h):
    closed_set = set()
    nodes = set()
    visited = {}

    nodes.add(initial_node)

    g_score = {initial_node: 0}
    h_score = {initial_node: h(graph,initial_node)}

    f_score = {initial_node: h_score[initial_node]}

    while nodes:
        x = None
        for node in nodes:
            if x is None:
                x = node
            elif f_score[x] < f_score[node]:
                x = node
        nodes.remove(x)
        if x == goal_node:
            return visited

        closed_set.add(x)

        for y in graph.edges[x]:
            if y in closed_set:
                continue
            temp_g_score = g_score[x] + 1  # graph.distances[(x,y)]
            flag = False

            if y not in nodes or temp_g_score < g_score[y]:
                nodes.add(y)
                flag = True

            if flag:
                visited[y]  = x
                g_score[y] = temp_g_score
                h_score[y] = h(graph,y)
                f_score[y] = g_score[y] + h_score[y]
    return False

def find_shortest_path(graph, initial_node, goal_node,h):
    distances, paths = dijkstra(graph, initial_node)
    #paths = astar(graph, initial_node ,goal_node,h)
    route = [goal_node]

    while goal_node != initial_node:
        route.append(paths[goal_node])
        goal_node = paths[goal_node]
    route.reverse()
    return route

def h(graph, node):
    return 1/len(graph.edges[node])

def main():

    heurist = lambda g, n: 1/len(g.edges[n])
    g = Graph()
    g.addNode("Rajini")
    g.addNode("Kamal")
    g.addNode("Sreedevi")
    g.addNode("Simran")
    g.addNode("Nayan")
    g.addNode("asin")
    g.addNode("simbu")
    g.addNode("arya")
    g.addNode("mohanlal")
    g.addNode("mammootty")
    g.addNode("Surya")

    g.addEdge("Rajini","Kamal",1)
    g.addEdge("Kamal", "Sreedevi",1 )
    g.addEdge("Rajini", "Sreedevi",1 )
    g.addEdge("Kamal", "Simran",1 )
    g.addEdge("Kamal", "mohanlal",1 )
    g.addEdge("Rajini", "Nayan",1 )
    g.addEdge("Rajini", "mammootty",1 )
    g.addEdge("Kamal", "asin",1 )
    g.addEdge("Nayan", "simbu",1 )
    g.addEdge("Nayan", "mammootty",1)
    g.addEdge("asin","Kamal", 1)
    g.addEdge("arya", "Nayan", 1)
    g.addEdge("Simran", "Surya", 1)
    g.addEdge("Surya", "asin", 1)

    print len(g.edges["Kamal"])
    print find_shortest_path(g, "Kamal", "Nayan", heurist)
    print len(find_shortest_path(g, "Kamal", "Nayan", heurist)) - 1


if __name__ == "__main__":
    main()




