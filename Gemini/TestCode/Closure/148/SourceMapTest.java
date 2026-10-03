package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

public class SourceMapTest {

  private SourceMap sourceMap;

  @Before
  public void setUp() {
    sourceMap = new SourceMap();
  }

  private Node createNode(String sourceFile, int lineno, int charno, String originalName) {
    Node node = new Node(0);
    if (sourceFile != null) {
      node.putProp(Node.SOURCEFILE_PROP, sourceFile);
    }
    node.setLineno(lineno);
    node.setCharno(charno);
    if (originalName != null) {
      node.putProp(Node.ORIGINALNAME_PROP, originalName);
    }
    return node;
  }

  @Test
  public void testAddMapping_nullSourceFile_ignored() throws IOException {
    Node node = createNode(null, 1, 0, null);
    sourceMap.addMapping(node, new Position(0, 0), new Position(0, 5));

    StringWriter out = new StringWriter();
    try {
      sourceMap.appendTo(out, "out.js");
      Assert.fail("Expected IllegalStateException for empty mappings");
    } catch (IllegalStateException expected) {
      // Expected because no mapping was added
    }
  }

  @Test
  public void testAddMapping_negativeLineNumber_ignored() throws IOException {
    Node node = createNode("test.js", -1, 0, null);
    sourceMap.addMapping(node, new Position(0, 0), new Position(0, 5));

    StringWriter out = new StringWriter();
    try {
      sourceMap.appendTo(out, "out.js");
      Assert.fail("Expected IllegalStateException for empty mappings");
    } catch (IllegalStateException expected) {
      // Expected because no mapping was added
    }
  }

  @Test
  public void testAddMapping_andAppendTo_singleMappingWithoutOriginalName() throws IOException {
    Node node = createNode("foo.js", 1, 2, null);
    sourceMap.addMapping(node, new Position(0, 0), new Position(0, 4));

    StringWriter out = new StringWriter();
    sourceMap.appendTo(out, "output.js");
    String result = out.toString();

    Assert.assertTrue(result.contains("/** Begin line maps. **/{ \"file\" : \"output.js\", \"count\": 1 }"));
    Assert.assertTrue(result.contains("[0,0,0,0]"));
    Assert.assertTrue(result.contains("/** Begin file information. **/"));
    Assert.assertTrue(result.contains("[]\n"));
    Assert.assertTrue(result.contains("/** Begin mapping definitions. **/"));
    Assert.assertTrue(result.contains("[\"foo.js\",1,2]"));
  }

  @Test
  public void testAddMapping_andAppendTo_withOriginalName() throws IOException {
    Node node = createNode("foo.js", 10, 5, "myVar");
    sourceMap.addMapping(node, new Position(0, 0), new Position(0, 3));

    StringWriter out = new StringWriter();
    sourceMap.appendTo(out, "output.js");
    String result = out.toString();

    Assert.assertTrue(result.contains("[\"foo.js\",10,5,\"myVar\"]"));
  }

  @Test
  public void testAddMapping_sourceFileCaching() throws IOException {
    String file1 = new String("file.js");
    String file2 = new String("file.js");

    Node node1 = createNode(file1, 1, 0, null);
    Node node2 = createNode(file2, 2, 0, null);

    sourceMap.addMapping(node1, new Position(0, 0), new Position(0, 2));
    sourceMap.addMapping(node2, new Position(0, 2), new Position(0, 4));

    StringWriter out = new StringWriter();
    sourceMap.appendTo(out, "out.js");
    String result = out.toString();

    Assert.assertTrue(result.contains("[0,0,1,1]"));
    Assert.assertTrue(result.contains("[\"file.js\",1,0]"));
    Assert.assertTrue(result.contains("[\"file.js\",2,0]"));
  }

  @Test
  public void testAddMapping_withStartingPositionOffset() throws IOException {
    sourceMap.setStartingPosition(1, 4);

    Node node1 = createNode("a.js", 1, 0, null);
    // startPosition line 0, endPosition line 0
    sourceMap.addMapping(node1, new Position(0, 0), new Position(0, 3));

    // startPosition line > 0, endPosition line > 0
    Node node2 = createNode("a.js", 2, 0, null);
    sourceMap.addMapping(node2, new Position(1, 0), new Position(1, 2));

    StringWriter out = new StringWriter();
    sourceMap.appendTo(out, "out.js");
    String result = out.toString();

    Assert.assertTrue(result.contains("/** Begin line maps. **/{ \"file\" : \"out.js\", \"count\": 3 }"));
  }

  @Test
  public void testSetWrapperPrefix_multilineAndSingleLine() throws IOException {
    sourceMap.setWrapperPrefix("(function(){\n  ");

    Node node = createNode("a.js", 1, 0, null);
    sourceMap.addMapping(node, new Position(0, 0), new Position(0, 3));

    StringWriter out = new StringWriter();
    sourceMap.appendTo(out, "out.js");
    String result = out.toString();

    Assert.assertTrue(result.contains("/** Begin line maps. **/{ \"file\" : \"out.js\", \"count\": 2 }"));
    Assert.assertTrue(result.contains("[-1,-1]\n[0,0,0]"));
  }

  @Test
  public void testSetWrapperPrefix_noNewline() throws IOException {
    sourceMap.setWrapperPrefix("/*prefix*/");

    Node node = createNode("a.js", 1, 0, null);
    sourceMap.addMapping(node, new Position(0, 0), new Position(0, 2));

    StringWriter out = new StringWriter();
    sourceMap.appendTo(out, "out.js");
    String result = out.toString();

    Assert.assertTrue(result.contains("[-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,0,0]"));
  }

  @Test
  public void testReset() throws IOException {
    Node node = createNode("a.js", 1, 0, null);
    sourceMap.setStartingPosition(2, 5);
    sourceMap.setWrapperPrefix("prefix\n");
    sourceMap.addMapping(node, new Position(0, 0), new Position(0, 2));

    sourceMap.reset();

    try {
      sourceMap.appendTo(new StringWriter(), "out.js");
      Assert.fail("Expected IllegalStateException because mappings were reset");
    } catch (IllegalStateException expected) {
      // Expected
    }

    // Add new mapping after reset
    sourceMap.addMapping(node, new Position(0, 0), new Position(0, 2));
    StringWriter out = new StringWriter();
    sourceMap.appendTo(out, "out.js");
    Assert.assertTrue(out.toString().contains("/** Begin line maps. **/{ \"file\" : \"out.js\", \"count\": 1 }"));
  }

  @Test
  public void testLineMapper_nestedAndSiblingMappings() throws IOException {
    // Parent mapping: chars 0 to 10
    Node parentNode = createNode("parent.js", 1, 0, null);
    sourceMap.addMapping(parentNode, new Position(0, 0), new Position(0, 10));

    // Child mapping 1: chars 2 to 5
    Node child1 = createNode("child1.js", 2, 0, null);
    sourceMap.addMapping(child1, new Position(0, 2), new Position(0, 5));

    // Child mapping 2: chars 6 to 8
    Node child2 = createNode("child2.js", 3, 0, null);
    sourceMap.addMapping(child2, new Position(0, 6), new Position(0, 8));

    StringWriter out = new StringWriter();
    sourceMap.appendTo(out, "out.js");
    String result = out.toString();

    // Line 0: 0,0, 1,1,1, 0, 2,2, 0,0
    Assert.assertTrue(result.contains("[0,0,1,1,1,0,2,2,0,0]"));
  }

  @Test
  public void testLineMapper_unmappedGap() throws IOException {
    // Gap before first mapping: starts at char 3
    Node node1 = createNode("a.js", 1, 0, null);
    sourceMap.addMapping(node1, new Position(0, 3), new Position(0, 6));

    // Gap between node1 and node2
    Node node2 = createNode("b.js", 2, 0, null);
    sourceMap.addMapping(node2, new Position(0, 9), new Position(0, 11));

    StringWriter out = new StringWriter();
    sourceMap.appendTo(out, "out.js");
    String result = out.toString();

    // -1 for gaps
    Assert.assertTrue(result.contains("[-1,-1,-1,0,0,0,-1,-1,-1,1,1]"));
  }

  @Test
  public void testLineMapper_multilineMappings() throws IOException {
    Node node = createNode("a.js", 1, 0, null);
    sourceMap.addMapping(node, new Position(0, 2), new Position(2, 4));

    StringWriter out = new StringWriter();
    sourceMap.appendTo(out, "out.js");
    String result = out.toString();

    Assert.assertTrue(result.contains("[-1,-1,0,0]"));
    Assert.assertTrue(result.contains("[0,0,0,0]"));
    Assert.assertTrue(result.contains("/** Begin line maps. **/{ \"file\" : \"out.js\", \"count\": 3 }"));
  }

  @Test
  public void testLineMapper_overlappingMultilineMappings() throws IOException {
    Node m1 = createNode("a.js", 1, 0, null);
    sourceMap.addMapping(m1, new Position(0, 0), new Position(2, 5));

    Node m2 = createNode("b.js", 2, 0, null);
    sourceMap.addMapping(m2, new Position(1, 2), new Position(1, 8));

    StringWriter out = new StringWriter();
    sourceMap.appendTo(out, "out.js");
    String result = out.toString();

    Assert.assertTrue(result.contains("/** Begin line maps. **/{ \"file\" : \"out.js\", \"count\": 3 }"));
  }

  @Test
  public void testMappingClass_appendToDirectly() throws IOException {
    SourceMap.Mapping mapping = new SourceMap.Mapping();
    mapping.id = 1;
    mapping.sourceFile = "\"foo.js\"";
    mapping.originalPosition = new Position(10, 20);
    mapping.originalName = "\"varName\"";

    StringBuilder sb = new StringBuilder();
    mapping.appendTo(sb);
    Assert.assertEquals("[\"foo.js\",10,20,\"varName\"]", sb.toString());

    SourceMap.Mapping mappingWithoutName = new SourceMap.Mapping();
    mappingWithoutName.id = 2;
    mappingWithoutName.sourceFile = "\"bar.js\"";
    mappingWithoutName.originalPosition = new Position(5, 0);
    mappingWithoutName.originalName = null;

    StringBuilder sb2 = new StringBuilder();
    mappingWithoutName.appendTo(sb2);
    Assert.assertEquals("[\"bar.js\",5,0]", sb2.toString());
  }

  @Test(expected = IllegalStateException.class)
  public void testAppendTo_emptyMappings_throwsException() throws IOException {
    sourceMap.appendTo(new StringWriter(), "empty.js");
  }
}
