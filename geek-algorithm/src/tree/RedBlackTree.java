package tree;

/**
 * @author shixinpeng
 * @description 红黑树
 * @ClassName: RedBlackTree
 * @date 2020/2/14
 *
 */
public class RedBlackTree {
    /*

    没有具体实现
    主要觉得极客时间中对红黑树只是想让大家了解到一种可以实现自平衡的二叉查找树，核心不在怎么去自己实现这个二叉查找树
    所有的左右旋和变色，都是为了符合红黑树的特性

    java treeMap中用红黑树来实现再平衡
    但大致看了实现过程，关于删除操作和极客时间讲的不太符合，需要仔细观察
    因为在讲解分析过程中，会存在红黑 黑黑节点，
    而treeMap使用bool值来表示红黑，没有第三、第四种状态的标识。

    而且对于红黑树的使用我有新的理解，
    红黑树主要用于自平衡，顺序性是由二叉查找树的特性决定的。
    数据处理也先是保证二叉查找树的数值的书序性，在进行平衡操作，维护树高
     */
}
