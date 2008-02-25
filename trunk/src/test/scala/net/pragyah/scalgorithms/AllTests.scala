package net.pragyah.scalgorithms

import net.pragyah.scalgorithms.sorting._
import net.pragyah.scalgorithms.heaps._
import net.pragyah.scalgorithms.dynamicprogramming._
import net.pragyah.scalgorithms.graphs._
import net.pragyah.scalgorithms.graphs.mst._
import net.pragyah.scalgorithms.graphs.search._

object AllTests {
  
  def main(args:Array[String]):Unit = {
    println("running tests")
    junit.textui.TestRunner.run(suite);
  }
  
  def suite : junit.framework.Test = {
    val suite = new junit.framework.TestSuite
    //Sorting
    suite.addTestSuite(classOf[TestQuickSort])
    suite.addTestSuite(classOf[TestMergeSort])
    //DynamicProgramming
    suite.addTestSuite(classOf[TestLongestCommonSubsequence])
    //Heaps
    suite.addTestSuite(classOf[TestBinomialHeap])
    suite.addTestSuite(classOf[TestFibonacciHeap])
    //Graphs
    suite.addTestSuite(classOf[TestGraphBasicsDirected])
    suite.addTestSuite(classOf[TestGraphBasicsUndirected])
    //Graph-MST
    suite.addTestSuite(classOf[TestKruskalsAlgorithm])
    suite.addTestSuite(classOf[TestPrimsAlgorithm])
    //Graphs-search
    suite.addTestSuite(classOf[TestBFS])
    suite.addTestSuite(classOf[TestDFS])
    suite.addTestSuite(classOf[TestTopolgicalSorting])
    suite.addTestSuite(classOf[TestStronglyConnectedComponents])

    
    return suite
  }
}
