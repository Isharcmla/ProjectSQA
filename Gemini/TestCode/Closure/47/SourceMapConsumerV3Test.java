package com.google.debugging.sourcemap;

import com.google.debugging.sourcemap.proto.Mapping.OriginalMapping;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SourceMapConsumerV3Test {

  private JSONObject createStandardSourceMapJson() throws JSONException {
    JSONObject json = new JSONObject();
    json.put("version", 3);
    json.put("file", "test.js");
    json.put("lineCount", 3);
    json.put("mappings", "AAAA,CAAC,EAAE,EAAG;AAAA,EAAEA;;");
    JSONArray sources = new JSONArray();
    sources.put("source1.js");
    json.put("sources", sources);
    JSONArray names = new JSONArray();
    names.put("symbolA");
    json.put("names", names);
    return json;
  }

  @Test
  public void testDefaultSourceMapSupplier_returnsNull() {
    SourceMapConsumerV3.DefaultSourceMapSupplier supplier =
        new SourceMapConsumerV3.DefaultSourceMapSupplier();
    Assert.assertNull(supplier.getSourceMap("http://example.com/map"));
  }

  @Test
  public void testParse_stringContents_success() throws Exception {
    SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
    String jsonString = createStandardSourceMapJson().toString();
    consumer.parse(jsonString);

    Collection<String> sources = consumer.getOriginalSources();
    Assert.assertEquals(1, sources.size());
    Assert.assertTrue(sources.contains("source1.js"));
  }

  @Test(expected = SourceMapParseException.class)
  public void testParse_invalidJsonString_throwsException() throws Exception {
    SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
    consumer.parse("not a json string");
  }

  @Test(expected = SourceMapParseException.class)
  public void testParse_wrongVersion_throwsException() throws Exception {
    SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
    JSONObject json = createStandardSourceMapJson();
    json.put("version", 2);
    consumer.parse(json);
  }

  @Test(expected = SourceMapParseException.class)
  public void testParse_emptyFile_throwsException() throws Exception {
    SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
    JSONObject json = createStandardSourceMapJson();
    json.put("file", "");
    consumer.parse(json);
  }

  @Test(expected = SourceMapParseException.class)
  public void testParse_missingFile_throwsException() throws Exception {
    SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
    JSONObject json = createStandardSourceMapJson();
    json.remove("file");
    consumer.parse(json);
  }

  @Test
  public void testParse_jsonObjectWithoutSupplier_success() throws Exception {
    SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
    JSONObject json = createStandardSourceMapJson();
    consumer.parse(json);

    OriginalMapping mapping = consumer.getMappingForLine(1, 1);
    Assert.assertNotNull(mapping);
    Assert.assertEquals("source1.js", mapping.getOriginalFile());
  }

  @Test
  public void testGetMappingForLine_outOfBoundsLines_returnsNull() throws Exception {
    SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
    consumer.parse(createStandardSourceMapJson());

    Assert.assertNull(consumer.getMappingForLine(0, 1));
    Assert.assertNull(consumer.getMappingForLine(10, 1));
  }

  @Test
  public void testGetMappingForLine_binarySearch_leftAndRightBranches() throws Exception {
    JSONObject json = new JSONObject();
    json.put("version", 3);
    json.put("file", "test.js");
    json.put("lineCount", 1);
    // col 0 (AAAA), col 5 (KAAA), col 10 (KAAA)
    json.put("mappings", "AAAA,KAAA,KAAA;");
    JSONArray sources = new JSONArray();
    sources.put("src.js");
    json.put("sources", sources);
    json.put("names", new JSONArray());

    SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
    consumer.parse(json);

    OriginalMapping mappingExact = consumer.getMappingForLine(1, 6);
    Assert.assertNotNull(mappingExact);

    OriginalMapping mappingRight = consumer.getMappingForLine(1, 8);
    Assert.assertNotNull(mappingRight);

    OriginalMapping mappingBeforeFirst = consumer.getMappingForLine(1, 0);
    Assert.assertNull(mappingBeforeFirst);
  }

  @Test
  public void testGetMappingForLine_emptyLineReturnsPreviousMapping() throws Exception {
    JSONObject json = new JSONObject();
    json.put("version", 3);
    json.put("file", "test.js");
    json.put("lineCount", 3);
    json.put("mappings", "AAAA;;AAAA;");
    JSONArray sources = new JSONArray();
    sources.put("src.js");
    json.put("sources", sources);
    json.put("names", new JSONArray());

    SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
    consumer.parse(json);

    OriginalMapping mappingLine2 = consumer.getMappingForLine(2, 1);
    Assert.assertNotNull(mappingLine2);
    Assert.assertEquals("src.js", mappingLine2.getOriginalFile());
  }

  @Test
  public void testGetMappingForLine_firstLineEmptyReturnsNull() throws Exception {
    JSONObject json = new JSONObject();
    json.put("version", 3);
    json.put("file", "test.js");
    json.put("lineCount", 2);
    json.put("mappings", ";AAAA;");
    JSONArray sources = new JSONArray();
    sources.put("src.js");
    json.put("sources", sources);
    json.put("names", new JSONArray());

    SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
    consumer.parse(json);

    Assert.assertNull(consumer.getMappingForLine(1, 1));
  }

  @Test
  public void testGetMappingForLine_unmappedEntryReturnsNull() throws Exception {
    JSONObject json = new JSONObject();
    json.put("version", 3);
    json.put("file", "test.js");
    json.put("lineCount", 1);
    // 1-value entry: unmapped
    json.put("mappings", "A;");
    json.put("sources", new JSONArray());
    json.put("names", new JSONArray());

    SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
    consumer.parse(json);

    OriginalMapping mapping = consumer.getMappingForLine(1, 1);
    Assert.assertNull(mapping);
  }

  @Test
  public void testGetMappingForLine_namedEntryReturnsIdentifier() throws Exception {
    JSONObject json = new JSONObject();
    json.put("version", 3);
    json.put("file", "test.js");
    json.put("lineCount", 1);
    // 5-value entry: mapped with identifier
    json.put("mappings", "AAAAA;");
    JSONArray sources = new JSONArray();
    sources.put("src.js");
    json.put("sources", sources);
    JSONArray names = new JSONArray();
    names.put("myIdentifier");
    json.put("names", names);

    SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
    consumer.parse(json);

    OriginalMapping mapping = consumer.getMappingForLine(1, 1);
    Assert.assertNotNull(mapping);
    Assert.assertEquals("myIdentifier", mapping.getIdentifier());
  }

  @Test(expected = IllegalStateException.class)
  public void testParse_invalidNumberOfEntryValues_throwsException() throws Exception {
    JSONObject json = new JSONObject();
    json.put("version", 3);
    json.put("file", "test.js");
    json.put("lineCount", 1);
    // 2-value entry: AA -> invalid
    json.put("mappings", "AA;");
    json.put("sources", new JSONArray());
    json.put("names", new JSONArray());

    SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
    consumer.parse(json);
  }

  @Test
  public void testGetReverseMapping_variousCases() throws Exception {
    JSONObject json = new JSONObject();
    json.put("version", 3);
    json.put("file", "test.js");
    json.put("lineCount", 2);
    // Line 0: AAAA (src 0, line 0, col 0)
    // Line 1: AAAA (src 0, line 0, col 0)
    json.put("mappings", "AAAA;AAAA;");
    JSONArray sources = new JSONArray();
    sources.put("src.js");
    json.put("sources", sources);
    json.put("names", new JSONArray());

    SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
    consumer.parse(json);

    // Matching file and line
    Collection<OriginalMapping> mappings = consumer.getReverseMapping("src.js", 0, 0);
    Assert.assertEquals(2, mappings.size());

    // Unknown file
    Collection<OriginalMapping> unknownFileMappings =
        consumer.getReverseMapping("unknown.js", 0, 0);
    Assert.assertTrue(unknownFileMappings.isEmpty());

    // Unknown line
    Collection<OriginalMapping> unknownLineMappings =
        consumer.getReverseMapping("src.js", 99, 0);
    Assert.assertTrue(unknownLineMappings.isEmpty());
  }

  @Test
  public void testVisitMappings_success() throws Exception {
    JSONObject json = new JSONObject();
    json.put("version", 3);
    json.put("file", "test.js");
    json.put("lineCount", 1);
    // Line 0: AAAAA (named), KAAA (unnamed), KA (unmapped)
    json.put("mappings", "AAAAA,KAAA,KA;");
    JSONArray sources = new JSONArray();
    sources.put("src.js");
    json.put("sources", sources);
    JSONArray names = new JSONArray();
    names.put("varName");
    json.put("names", names);

    SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
    consumer.parse(json);

    final List<String> visited = new ArrayList<String>();
    consumer.visitMappings(new SourceMapConsumerV3.EntryVisitor() {
      @Override
      public void visit(
          String sourceName,
          String symbolName,
          FilePosition sourceStartPosition,
          FilePosition startPosition,
          FilePosition endPosition) {
        visited.add(sourceName + ":" + symbolName + ":" +
            startPosition.getLine() + "," + startPosition.getColumn() + "->" +
            endPosition.getLine() + "," + endPosition.getColumn());
      }
    });

    Assert.assertFalse(visited.isEmpty());
    Assert.assertEquals("src.js:varName:0,0->0,5", visited.get(0));
  }

  @Test
  public void testParseMetaMap_sectionsWithMapAndUrl_success() throws Exception {
    JSONObject subMap1 = new JSONObject();
    subMap1.put("version", 3);
    subMap1.put("file", "sub1.js");
    subMap1.put("lineCount", 1);
    subMap1.put("mappings", "AAAA;");
    JSONArray sources1 = new JSONArray();
    sources1.put("sub1_src.js");
    subMap1.put("sources", sources1);
    subMap1.put("names", new JSONArray());

    final JSONObject subMap2 = new JSONObject();
    subMap2.put("version", 3);
    subMap2.put("file", "sub2.js");
    subMap2.put("lineCount", 1);
    subMap2.put("mappings", "AAAA;");
    JSONArray sources2 = new JSONArray();
    sources2.put("sub2_src.js");
    subMap2.put("sources", sources2);
    subMap2.put("names", new JSONArray());

    JSONObject metaMap = new JSONObject();
    metaMap.put("version", 3);
    metaMap.put("file", "meta.js");

    JSONArray sections = new JSONArray();

    JSONObject sec1 = new JSONObject();
    JSONObject offset1 = new JSONObject();
    offset1.put("line", 0);
    offset1.put("column", 0);
    sec1.put("offset", offset1);
    sec1.put("map", subMap1.toString());
    sections.put(sec1);

    JSONObject sec2 = new JSONObject();
    JSONObject offset2 = new JSONObject();
    offset2.put("line", 1);
    offset2.put("column", 0);
    sec2.put("offset", offset2);
    sec2.put("url", "http://example.com/part2.map");
    sections.put(sec2);

    metaMap.put("sections", sections);

    SourceMapSupplier supplier = new SourceMapSupplier() {
      @Override
      public String getSourceMap(String url) {
        if ("http://example.com/part2.map".equals(url)) {
          return subMap2.toString();
        }
        return null;
      }
    };

    SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
    consumer.parse(metaMap.toString(), supplier);

    Collection<String> origSources = consumer.getOriginalSources();
    Assert.assertTrue(origSources.contains("sub1_src.js"));
    Assert.assertTrue(origSources.contains("sub2_src.js"));
  }

  @Test(expected = SourceMapParseException.class)
  public void testParseMetaMap_versionMismatch_throwsException() throws Exception {
    JSONObject metaMap = new JSONObject();
    metaMap.put("version", 2);
    metaMap.put("file", "meta.js");
    metaMap.put("sections", new JSONArray());

    SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
    consumer.parse(metaMap);
  }

  @Test(expected = SourceMapParseException.class)
  public void testParseMetaMap_emptyFile_throwsException() throws Exception {
    JSONObject metaMap = new JSONObject();
    metaMap.put("version", 3);
    metaMap.put("file", "");
    metaMap.put("sections", new JSONArray());

    SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
    consumer.parse(metaMap);
  }

  @Test(expected = SourceMapParseException.class)
  public void testParseMetaMap_hasInvalidStandardFields_throwsException() throws Exception {
    JSONObject metaMap = new JSONObject();
    metaMap.put("version", 3);
    metaMap.put("file", "meta.js");
    metaMap.put("sections", new JSONArray());
    metaMap.put("mappings", "AAAA;");

    SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
    consumer.parse(metaMap);
  }

  @Test(expected = SourceMapParseException.class)
  public void testParseMetaMap_sectionWithBothMapAndUrl_throwsException() throws Exception {
    JSONObject metaMap = new JSONObject();
    metaMap.put("version", 3);
    metaMap.put("file", "meta.js");

    JSONArray sections = new JSONArray();
    JSONObject sec = new JSONObject();
    JSONObject offset = new JSONObject();
    offset.put("line", 0);
    offset.put("column", 0);
    sec.put("offset", offset);
    sec.put("map", "{}");
    sec.put("url", "http://example.com/map");
    sections.put(sec);
    metaMap.put("sections", sections);

    SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
    consumer.parse(metaMap);
  }

  @Test(expected = SourceMapParseException.class)
  public void testParseMetaMap_sectionWithNeitherMapNorUrl_throwsException() throws Exception {
    JSONObject metaMap = new JSONObject();
    metaMap.put("version", 3);
    metaMap.put("file", "meta.js");

    JSONArray sections = new JSONArray();
    JSONObject sec = new JSONObject();
    JSONObject offset = new JSONObject();
    offset.put("line", 0);
    offset.put("column", 0);
    sec.put("offset", offset);
    sections.put(sec);
    metaMap.put("sections", sections);

    SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
    consumer.parse(metaMap);
  }

  @Test(expected = SourceMapParseException.class)
  public void testParseMetaMap_urlRetrievalFails_throwsException() throws Exception {
    JSONObject metaMap = new JSONObject();
    metaMap.put("version", 3);
    metaMap.put("file", "meta.js");

    JSONArray sections = new JSONArray();
    JSONObject sec = new JSONObject();
    JSONObject offset = new JSONObject();
    offset.put("line", 0);
    offset.put("column", 0);
    sec.put("offset", offset);
    sec.put("url", "http://example.com/unresolved.map");
    sections.put(sec);
    metaMap.put("sections", sections);

    SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
    consumer.parse(metaMap);
  }
}
