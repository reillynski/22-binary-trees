import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class TestCases
{

   @Test
   public void testBuildTree() {
      BinaryTree t = new BinaryTree(new int[] {34, 23, 76, 45, 12, 32});
      assertEquals(76, t.getRoot().value);
      assertEquals(34, t.getRoot().left.value);
      assertEquals(23, t.getRoot().left.right.value);
      // Test the rest of the tree
   }

   @Test
   public void testPreOrder() {
      BinaryTree t = new BinaryTree(new int[] {1, 2, 3});
      t.preOrder(t.getRoot(), 0);
   }
}
