<h1> 211 Programming Exercises </h1>

<p>Some programs I wrote when studying for my SOFTENG211 paper. A lot of chapters have been missed and some stuff is incomplete. I figured that I might as well show this as there are some things here that I think is kinda cool.<br></p>

<p>Most of the program exercises are from "Lectures on Discrete Mathematics for Computer Science" by Bakhadyr Khoussainov and Nodira Khoussainova. However, some of these algorithms used a 'GOTO' function. Java does not have this, so I had to improvise.  </p>

<h3>Chapter 5 - Graphs </h3>
<img src="https://i.imgur.com/l8urQ9Q.png" alt="Graph" />
<p> This pretty much highlights the colour of the even vertices to red. This is done in a brute force method, where it iterates through all vertices and all edges and checks how many edges are correlated to the specific vertex. The code snippet is shown below: </p>

```
    public List<Vertex> checkEven() {
        for (Vertex vertex : _vertices) {
            int count = 0;
            for (Edge edge : _edges) {
                if (edge.getStartingVertex().equals(vertex) || edge.getEndingVertex().equals(vertex)) {
                    count++;
                }
            }
            if (count % 2 == 0) {
                vertex.setColour(Color.red);
            }
        }
        return _vertices;
    }
```

<h3>Chapter 6 - Path Existence </h3>
<img src="https://i.imgur.com/L6nG933.png" alt="Graph" />
<p> This displays determines if there exists a path between two vertices. In this case, it checks if there is a path from vertex zero to five, which there is. The blue represents the connected component from the starting vertex.</p>

<p>My implementation checks the neighbours of the vertex recursively. The following is the code snippet of it:  </p>

```
    private void checkNeighbours(List<Vertex> neighbours) {
        for (Vertex vertex : neighbours) {
            if (vertex.isVisited()) {
                continue;
            }
            vertex.setVisited(true);
            if (getNeighbours(vertex).size() > 1) {
                checkNeighbours(getNeighbours(vertex));
            }
        }
    }
```
