package com.google.javascript.jscomp;

import com.google.debugging.sourcemap.FilePosition;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class SourceMapTest {

  private SourceMap sourceMap;

  @Before
  public void setUp() {
    sourceMap = SourceMap.Format.V3.getInstance();
  }

  @Test
  public void testFormatEnum_instancesAndValues_createNonNullInstances() {
    for (SourceMap.Format format : SourceMap.Format.values()) {
      SourceMap sm = format.getInstance();
      assertNotNull("Instance should not be null for format " + format, sm);
      assertEquals(format, SourceMap.Format.valueOf(format.name()));
    }
  }

  @Test
  public void testDetailLevelEnum_valuesAndValueOf() {
    for (SourceMap.DetailLevel level : SourceMap.DetailLevel.values()) {
      assertEquals(level, SourceMap.DetailLevel.valueOf(level.name()));
    }
  }

  @Test
  public void testDetailLevel_all_alwaysReturnsTrue() {
    Node node = new Node(Token.NUMBER);
    assertTrue(SourceMap.DetailLevel.ALL.apply(node));

    Node nullNode = null;
    assertTrue(SourceMap.DetailLevel.ALL.apply(nullNode));
  }

  @Test
  public void testDetailLevel_symbols_matchingNodesReturnTrue() {
    Node callNode = new Node(Token.CALL);
    assertTrue(SourceMap.DetailLevel.SYMBOLS.apply(callNode));

    Node newNode = new Node(Token.NEW);
    assertTrue(SourceMap.DetailLevel.SYMBOLS.apply(newNode));

    Node fnNode = new Node(Token.FUNCTION);
    assertTrue(SourceMap.DetailLevel.SYMBOLS.apply(fnNode));

    Node nameNode = Node.newString(Token.NAME, "foo");
    assertTrue(SourceMap.DetailLevel.SYMBOLS.apply(nameNode));

    Node getPropNode = new Node(Token.GETPROP);
    assertTrue(SourceMap.DetailLevel.SYMBOLS.apply(getPropNode));

    Node getElemNode = new Node(Token.GETELEM);
    assertTrue(SourceMap.DetailLevel.SYMBOLS.apply(getElemNode));

    Node objLit = new Node(Token.OBJECTLIT);
    Node stringKey = Node.newString(Token.STRING_KEY, "key");
    objLit.addChildToBack(stringKey);
    assertTrue(SourceMap.DetailLevel.SYMBOLS.apply(stringKey));

    Node parentGet = new Node(Token.GETPROP);
    Node stringInGet = Node.newString(Token.STRING, "bar");
    parentGet.addChildToBack(stringInGet);
    assertTrue(SourceMap.DetailLevel.SYMBOLS.apply(stringInGet));
  }

  @Test
  public void testDetailLevel_symbols_nonMatchingNodesReturnFalse() {
    Node numberNode = Node.newNumber(123);
    assertFalse(SourceMap.DetailLevel.SYMBOLS.apply(numberNode));

    Node varNode = new Node(Token.VAR);
    assertFalse(SourceMap.DetailLevel.SYMBOLS.apply(varNode));

    Node standaloneString = Node.newString(Token.STRING, "standalone");
    assertFalse(SourceMap.DetailLevel.SYMBOLS.apply(standaloneString));
  }

  @Test
  public void testLocationMapping_constructorAndFields() {
    SourceMap.LocationMapping mapping = new SourceMap.LocationMapping("/prefix/", "/replacement/");
    assertEquals("/prefix/", mapping.prefix);
    assertEquals("/replacement/", mapping.replacement);
  }

  @Test
  public void testAddMapping_nullSourceFile_mappingIgnored() throws IOException {
    Node node = new Node(Token.NAME);
    node.setLineno(1);
    node.setCharno(0);

    FilePosition start = new FilePosition(1, 0);
    FilePosition end = new FilePosition(1, 5);

    sourceMap.addMapping(node, start, end);

    StringWriter writer = new StringWriter();
    sourceMap.appendTo(writer, "output.js");
    String result = writer.toString();
    assertFalse(result.contains("output.js\""));
  }

  @Test
  public void testAddMapping_negativeLineNumber_mappingIgnored() throws IOException {
    Node node = Node.newString(Token.NAME, "test");
    node.putProp(Node.SOURCENAME_PROP, "test.js");
    node.setLineno(-1);
    node.setCharno(0);

    FilePosition start = new FilePosition(1, 0);
    FilePosition end = new FilePosition(1, 5);

    sourceMap.addMapping(node, start, end);

    StringWriter writer = new StringWriter();
    sourceMap.appendTo(writer, "output.js");
    String result = writer.toString();
    assertFalse(result.contains("test.js"));
  }

  @Test
  public void testAddMapping_validNodeWithoutPrefixMappings_addedSuccessfully() throws IOException {
    Node node = Node.newString(Token.NAME, "test");
    node.putProp(Node.SOURCENAME_PROP, "test.js");
    node.setLineno(10);
    node.setCharno(5);

    FilePosition start = new FilePosition(0, 0);
    FilePosition end = new FilePosition(0, 10);

    sourceMap.addMapping(node, start, end);

    StringWriter writer = new StringWriter();
    sourceMap.appendTo(writer, "output.js");
    String result = writer.toString();
    assertTrue(result.contains("test.js"));
  }

  @Test
  public void testAddMapping_withOriginalNameProp_addedSuccessfully() throws IOException {
    Node node = Node.newString(Token.NAME, "renamed");
    node.putProp(Node.SOURCENAME_PROP, "test.js");
    node.putProp(Node.ORIGINALNAME_PROP, "originalVarName");
    node.setLineno(5);
    node.setCharno(2);

    FilePosition start = new FilePosition(0, 0);
    FilePosition end = new FilePosition(0, 7);

    sourceMap.addMapping(node, start, end);

    StringWriter writer = new StringWriter();
    sourceMap.appendTo(writer, "output.js");
    String result = writer.toString();
    assertTrue(result.contains("originalVarName"));
  }

  @Test
  public void testAddMapping_withPrefixMappings_matchingAndCaching() throws IOException {
    List<SourceMap.LocationMapping> mappings = new ArrayList<SourceMap.LocationMapping>();
    mappings.add(new SourceMap.LocationMapping("/prefix/path/", "http://cdn.com/"));
    mappings.add(new SourceMap.LocationMapping("/unmatched/", "http://other.com/"));

    sourceMap.setPrefixMappings(mappings);

    Node node1 = Node.newString(Token.NAME, "a");
    node1.putProp(Node.SOURCENAME_PROP, "/prefix/path/file1.js");
    node1.setLineno(1);
    node1.setCharno(0);

    FilePosition start1 = new FilePosition(0, 0);
    FilePosition end1 = new FilePosition(0, 5);

    sourceMap.addMapping(node1, start1, end1);

    // Add again to test fixupSourceLocation cache hit
    Node node2 = Node.newString(Token.NAME, "b");
    node2.putProp(Node.SOURCENAME_PROP, "/prefix/path/file1.js");
    node2.setLineno(2);
    node2.setCharno(0);

    sourceMap.addMapping(node2, start1, end1);

    StringWriter writer = new StringWriter();
    sourceMap.appendTo(writer, "output.js");
    String result = writer.toString();
    assertTrue(result.contains("http://cdn.com/file1.js"));
  }

  @Test
  public void testAddMapping_withPrefixMappings_unmatchedPathCaching() throws IOException {
    List<SourceMap.LocationMapping> mappings = Collections.singletonList(
        new SourceMap.LocationMapping("/mapped/", "/fixed/")
    );
    sourceMap.setPrefixMappings(mappings);

    Node node = Node.newString(Token.NAME, "a");
    node.putProp(Node.SOURCENAME_PROP, "/unmapped/file.js");
    node.setLineno(1);
    node.setCharno(0);

    FilePosition start = new FilePosition(0, 0);
    FilePosition end = new FilePosition(0, 5);

    // First call: cache miss, no match found -> caches original path
    sourceMap.addMapping(node, start, end);

    // Second call: cache hit for original path
    sourceMap.addMapping(node, start, end);

    StringWriter writer = new StringWriter();
    sourceMap.appendTo(writer, "output.js");
    String result = writer.toString();
    assertTrue(result.contains("/unmapped/file.js"));
  }

  @Test
  public void testReset_clearsStateAndCache() throws IOException {
    sourceMap.setPrefixMappings(Collections.singletonList(
        new SourceMap.LocationMapping("/prefix/", "/replaced/")
    ));

    Node node = Node.newString(Token.NAME, "x");
    node.putProp(Node.SOURCENAME_PROP, "/prefix/test.js");
    node.setLineno(1);
    node.setCharno(0);

    sourceMap.addMapping(node, new FilePosition(0, 0), new FilePosition(0, 1));
    sourceMap.reset();

    StringWriter writer = new StringWriter();
    sourceMap.appendTo(writer, "out.js");
    // After reset, no mappings should be present in generated output
    String result = writer.toString();
    assertFalse(result.contains("/replaced/test.js"));
  }

  @Test
  public void testSetStartingPosition_appliesWithoutException() {
    sourceMap.setStartingPosition(10, 5);
  }

  @Test
  public void testSetWrapperPrefix_appliesWithoutException() {
    sourceMap.setWrapperPrefix("(function(){\n");
  }

  @Test
  public void testValidate_trueAndFalse_executesWithoutException() {
    sourceMap.validate(true);
    sourceMap.validate(false);
  }

  @Test
  public void testAppendTo_allFormats_writesExpectedOutput() throws IOException {
    for (SourceMap.Format format : SourceMap.Format.values()) {
      SourceMap sm = format.getInstance();
      Node node = Node.newString(Token.NAME, "foo");
      node.putProp(Node.SOURCENAME_PROP, "input.js");
      node.setLineno(1);
      node.setCharno(0);

      sm.addMapping(node, new FilePosition(0, 0), new FilePosition(0, 3));
      StringWriter out = new StringWriter();
      sm.appendTo(out, "output.js");
      assertTrue(out.toString().length() > 0);
    }
  }
}
