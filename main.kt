class Point3D {
    var x: Int = 0
    var y: Int = 0
    var z: Int = 0
}

fun createPoint(x: Int, y: Int, z: Int): Point3D {
    val pointCopy = Point3D()
    pointCopy.x = x
    pointCopy.y = y
    pointCopy.z = z
    return pointCopy
}
