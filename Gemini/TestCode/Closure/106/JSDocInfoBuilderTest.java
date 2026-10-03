package com.google.javascript.rhino;

import com.google.javascript.rhino.JSDocInfo.Visibility;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class JSDocInfoBuilderTest {

  private JSDocInfoBuilder builderWithDoc;
  private JSDocInfoBuilder builderWithoutDoc;

  @Before
  public void setUp() {
    builderWithDoc = new JSDocInfoBuilder(true);
    builderWithoutDoc = new JSDocInfoBuilder(false);
  }

  private JSTypeExpression createTypeExpression(String typeName) {
    return new JSTypeExpression(Node.newString(typeName), "testSource");
  }

  @Test
  public void testInitialState() {
    Assert.assertFalse(builderWithDoc.isPopulated());
    Assert.assertFalse(builderWithDoc.isPopulatedWithFileOverview());
    Assert.assertFalse(builderWithDoc.isDescriptionRecorded());
    Assert.assertFalse(builderWithDoc.isConstructorRecorded());
    Assert.assertFalse(builderWithDoc.isInterfaceRecorded());
    Assert.assertNull(builderWithDoc.build("source.js"));
  }

  @Test
  public void testBuild_whenPopulated_resetsStateAndSetsDefaults() {
    builderWithDoc.recordDeprecated();
    Assert.assertTrue(builderWithDoc.isPopulated());

    JSDocInfo info = builderWithDoc.build("test.js");
    Assert.assertNotNull(info);
    Assert.assertEquals("test.js", info.getSourceName());
    Assert.assertEquals(Visibility.INHERITED, info.getVisibility());
    Assert.assertTrue(info.isDeprecated());

    Assert.assertFalse(builderWithDoc.isPopulated());
    Assert.assertNull(builderWithDoc.build("test.js"));
  }

  @Test
  public void testBuild_withExplicitVisibility_preservesVisibility() {
    builderWithDoc.recordVisibility(Visibility.PRIVATE);
    JSDocInfo info = builderWithDoc.build("source.js");
    Assert.assertNotNull(info);
    Assert.assertEquals(Visibility.PRIVATE, info.getVisibility());
  }

  @Test
  public void testMarkers_withParseDocumentationTrue() {
    builderWithDoc.markAnnotation("param", 10, 2);
    builderWithDoc.markText("param description", 10, 8, 10, 25);
    builderWithDoc.markTypeNode(Node.newString("string"), 10, 3, 7, true);
    builderWithDoc.markName("paramName", 10, 8);

    Assert.assertNotNull(builderWithDoc);
  }

  @Test
  public void testMarkers_withParseDocumentationFalse() {
    builderWithoutDoc.markAnnotation("param", 1, 0);
    builderWithoutDoc.markText("text", 1, 5, 1, 9);
    builderWithoutDoc.markTypeNode(Node.newString("number"), 1, 0, 4, false);
    builderWithoutDoc.markName("foo", 1, 5);

    Assert.assertFalse(builderWithoutDoc.isPopulated());
  }

  @Test
  public void testMarkers_whenCurrentMarkerIsNull() {
    builderWithDoc.markText("text without annotation", 1, 0, 1, 5);
    builderWithDoc.markTypeNode(Node.newString("number"), 1, 0, 4, false);
    builderWithDoc.markName("bar", 1, 0);

    Assert.assertFalse(builderWithDoc.isPopulated());
  }

  @Test
  public void testRecordBlockDescription() {
    Assert.assertTrue(builderWithDoc.recordBlockDescription("A block description"));
    Assert.assertTrue(builderWithDoc.isPopulated());

    Assert.assertTrue(builderWithoutDoc.recordBlockDescription("A block description"));
    Assert.assertFalse(builderWithoutDoc.isPopulated());
  }

  @Test
  public void testRecordVisibility() {
    Assert.assertTrue(builderWithDoc.recordVisibility(Visibility.PUBLIC));
    Assert.assertTrue(builderWithDoc.isPopulated());
    Assert.assertFalse(builderWithDoc.recordVisibility(Visibility.PROTECTED));
  }

  @Test
  public void testRecordParameter_normalAndDuplicates() {
    JSTypeExpression type = createTypeExpression("string");
    Assert.assertFalse(builderWithDoc.hasParameter("x"));
    Assert.assertTrue(builderWithDoc.recordParameter("x", type));
    Assert.assertTrue(builderWithDoc.hasParameter("x"));
    Assert.assertTrue(builderWithDoc.isPopulated());

    Assert.assertFalse(builderWithDoc.recordParameter("x", type));
  }

  @Test
  public void testRecordParameter_whenSingletonTypePresent() {
    builderWithDoc.recordType(createTypeExpression("number"));
    Assert.assertFalse(builderWithDoc.recordParameter("arg", createTypeExpression("string")));
  }

  @Test
  public void testRecordParameterDescription() {
    builderWithDoc.recordParameter("param1", createTypeExpression("string"));
    Assert.assertTrue(builderWithDoc.recordParameterDescription("param1", "description"));
    Assert.assertFalse(builderWithDoc.recordParameterDescription("param1", "duplicate desc"));
    Assert.assertFalse(builderWithDoc.recordParameterDescription("nonExistent", "desc"));
  }

  @Test
  public void testRecordTemplateTypeName() {
    Assert.assertTrue(builderWithDoc.recordTemplateTypeName("T"));
    Assert.assertTrue(builderWithDoc.isPopulated());
    Assert.assertFalse(builderWithDoc.recordTemplateTypeName("T"));
  }

  @Test
  public void testRecordThrowType_normalAndWithSingletonTag() {
    JSTypeExpression errorType = createTypeExpression("Error");
    Assert.assertTrue(builderWithDoc.recordThrowType(errorType));
    Assert.assertTrue(builderWithDoc.isPopulated());

    JSDocInfoBuilder singletonBuilder = new JSDocInfoBuilder(true);
    singletonBuilder.recordType(createTypeExpression("number"));
    Assert.assertFalse(singletonBuilder.recordThrowType(errorType));
  }

  @Test
  public void testRecordThrowDescription() {
    JSTypeExpression errorType = createTypeExpression("Error");
    builderWithDoc.recordThrowType(errorType);
    Assert.assertTrue(builderWithDoc.recordThrowDescription(errorType, "Throws on error"));
    Assert.assertFalse(builderWithDoc.recordThrowDescription(errorType, "Duplicate throws desc"));
  }

  @Test
  public void testAddAuthor() {
    Assert.assertTrue(builderWithDoc.addAuthor("Alice"));
    Assert.assertTrue(builderWithDoc.isPopulated());
    Assert.assertTrue(builderWithDoc.addAuthor("Bob"));
  }

  @Test
  public void testAddReference() {
    Assert.assertTrue(builderWithDoc.addReference("http://example.com"));
    Assert.assertTrue(builderWithDoc.isPopulated());
    Assert.assertTrue(builderWithDoc.addReference("http://example2.com"));
  }

  @Test
  public void testRecordVersion() {
    Assert.assertTrue(builderWithDoc.recordVersion("1.0.0"));
    Assert.assertTrue(builderWithDoc.isPopulated());
    Assert.assertFalse(builderWithDoc.recordVersion("2.0.0"));
  }

  @Test
  public void testRecordDeprecationReason() {
    Assert.assertTrue(builderWithDoc.recordDeprecationReason("Use bar instead"));
    Assert.assertTrue(builderWithDoc.isPopulated());
    Assert.assertFalse(builderWithDoc.recordDeprecationReason("Another reason"));
  }

  @Test
  public void testRecordSuppressions() {
    Set<String> suppressions = new HashSet<String>();
    suppressions.add("checkTypes");
    Assert.assertTrue(builderWithDoc.recordSuppressions(suppressions));
    Assert.assertTrue(builderWithDoc.isPopulated());
    Assert.assertFalse(builderWithDoc.recordSuppressions(Collections.singleton("extra")));
  }

  @Test
  public void testRecordType_normalNullAndCollisions() {
    Assert.assertFalse(builderWithDoc.recordType(null));

    JSTypeExpression type = createTypeExpression("boolean");
    Assert.assertTrue(builderWithDoc.recordType(type));
    Assert.assertTrue(builderWithDoc.isPopulated());

    Assert.assertFalse(builderWithDoc.recordType(type));
  }

  @Test
  public void testRecordType_withOtherTypeRelatedTags() {
    builderWithDoc.recordConstructor();
    Assert.assertFalse(builderWithDoc.recordType(createTypeExpression("number")));

    JSDocInfoBuilder builder2 = new JSDocInfoBuilder(true);
    builder2.recordInterface();
    Assert.assertFalse(builder2.recordType(createTypeExpression("number")));

    JSDocInfoBuilder builder3 = new JSDocInfoBuilder(true);
    builder3.recordParameter("x", createTypeExpression("string"));
    Assert.assertFalse(builder3.recordType(createTypeExpression("number")));

    JSDocInfoBuilder builder4 = new JSDocInfoBuilder(true);
    builder4.recordReturnType(createTypeExpression("string"));
    Assert.assertFalse(builder4.recordType(createTypeExpression("number")));

    JSDocInfoBuilder builder5 = new JSDocInfoBuilder(true);
    builder5.recordBaseType(createTypeExpression("Base"));
    Assert.assertFalse(builder5.recordType(createTypeExpression("number")));

    JSDocInfoBuilder builder6 = new JSDocInfoBuilder(true);
    builder6.recordThisType(createTypeExpression("Window"));
    Assert.assertFalse(builder6.recordType(createTypeExpression("number")));
  }

  @Test
  public void testRecordTypedef() {
    Assert.assertFalse(builderWithDoc.recordTypedef(null));

    JSTypeExpression type = createTypeExpression("string|number");
    Assert.assertTrue(builderWithDoc.recordTypedef(type));
    Assert.assertTrue(builderWithDoc.isPopulated());

    Assert.assertFalse(builderWithDoc.recordTypedef(type));
  }

  @Test
  public void testRecordReturnType() {
    Assert.assertFalse(builderWithDoc.recordReturnType(null));

    JSTypeExpression retType = createTypeExpression("number");
    Assert.assertTrue(builderWithDoc.recordReturnType(retType));
    Assert.assertTrue(builderWithDoc.isPopulated());

    Assert.assertFalse(builderWithDoc.recordReturnType(retType));

    JSDocInfoBuilder singletonBuilder = new JSDocInfoBuilder(true);
    singletonBuilder.recordTypedef(createTypeExpression("string"));
    Assert.assertFalse(singletonBuilder.recordReturnType(retType));
  }

  @Test
  public void testRecordReturnDescription() {
    Assert.assertTrue(builderWithDoc.recordReturnDescription("returns a value"));
    Assert.assertTrue(builderWithDoc.isPopulated());
    Assert.assertFalse(builderWithDoc.recordReturnDescription("duplicate"));
  }

  @Test
  public void testRecordDefineType() {
    Assert.assertFalse(builderWithDoc.recordDefineType(null));

    JSDocInfoBuilder constBuilder = new JSDocInfoBuilder(true);
    constBuilder.recordConstancy();
    Assert.assertFalse(constBuilder.recordDefineType(createTypeExpression("boolean")));

    JSTypeExpression type = createTypeExpression("boolean");
    Assert.assertTrue(builderWithDoc.recordDefineType(type));
    Assert.assertTrue(builderWithDoc.isPopulated());

    Assert.assertFalse(builderWithDoc.recordDefineType(type));
  }

  @Test
  public void testRecordEnumParameterType() {
    Assert.assertFalse(builderWithDoc.recordEnumParameterType(null));

    JSTypeExpression type = createTypeExpression("number");
    Assert.assertTrue(builderWithDoc.recordEnumParameterType(type));
    Assert.assertTrue(builderWithDoc.isPopulated());

    Assert.assertFalse(builderWithDoc.recordEnumParameterType(type));

    JSDocInfoBuilder conflictBuilder = new JSDocInfoBuilder(true);
    conflictBuilder.recordConstructor();
    Assert.assertFalse(conflictBuilder.recordEnumParameterType(type));
  }

  @Test
  public void testRecordThisType() {
    Assert.assertFalse(builderWithDoc.recordThisType(null));

    JSTypeExpression type = createTypeExpression("Element");
    Assert.assertTrue(builderWithDoc.recordThisType(type));
    Assert.assertTrue(builderWithDoc.isPopulated());

    Assert.assertFalse(builderWithDoc.recordThisType(type));

    JSDocInfoBuilder enumBuilder = new JSDocInfoBuilder(true);
    enumBuilder.recordEnumParameterType(createTypeExpression("number"));
    Assert.assertFalse(enumBuilder.recordThisType(type));
  }

  @Test
  public void testRecordBaseType() {
    Assert.assertFalse(builderWithDoc.recordBaseType(null));

    JSTypeExpression type = createTypeExpression("BaseClass");
    Assert.assertTrue(builderWithDoc.recordBaseType(type));
    Assert.assertTrue(builderWithDoc.isPopulated());

    Assert.assertFalse(builderWithDoc.recordBaseType(type));

    JSDocInfoBuilder singletonBuilder = new JSDocInfoBuilder(true);
    singletonBuilder.recordType(createTypeExpression("number"));
    Assert.assertFalse(singletonBuilder.recordBaseType(type));
  }

  @Test
  public void testRecordConstancy() {
    Assert.assertTrue(builderWithDoc.recordConstancy());
    Assert.assertTrue(builderWithDoc.isPopulated());
    Assert.assertFalse(builderWithDoc.recordConstancy());
  }

  @Test
  public void testRecordDescription() {
    Assert.assertFalse(builderWithDoc.recordDescription(null));
    Assert.assertFalse(builderWithDoc.isDescriptionRecorded());

    Assert.assertTrue(builderWithDoc.recordDescription("Valid description"));
    Assert.assertTrue(builderWithDoc.isDescriptionRecorded());
    Assert.assertTrue(builderWithDoc.isPopulated());

    Assert.assertFalse(builderWithDoc.recordDescription("Duplicate description"));
  }

  @Test
  public void testRecordFileOverview() {
    Assert.assertFalse(builderWithDoc.isPopulatedWithFileOverview());
    Assert.assertTrue(builderWithDoc.recordFileOverview("File description"));
    Assert.assertTrue(builderWithDoc.isPopulatedWithFileOverview());
    Assert.assertFalse(builderWithDoc.recordFileOverview("Another overview"));
  }

  @Test
  public void testRecordHiddenness() {
    Assert.assertTrue(builderWithDoc.recordHiddenness());
    Assert.assertTrue(builderWithDoc.isPopulated());
    Assert.assertFalse(builderWithDoc.recordHiddenness());
  }

  @Test
  public void testRecordNoTypeCheck() {
    Assert.assertTrue(builderWithDoc.recordNoTypeCheck());
    Assert.assertTrue(builderWithDoc.isPopulated());
    Assert.assertFalse(builderWithDoc.recordNoTypeCheck());
  }

  @Test
  public void testRecordConstructor_andCollisions() {
    Assert.assertFalse(builderWithDoc.isConstructorRecorded());
    Assert.assertTrue(builderWithDoc.recordConstructor());
    Assert.assertTrue(builderWithDoc.isConstructorRecorded());
    Assert.assertTrue(builderWithDoc.isPopulated());

    Assert.assertFalse(builderWithDoc.recordConstructor());
    Assert.assertFalse(builderWithDoc.recordInterface());

    JSDocInfoBuilder singletonBuilder = new JSDocInfoBuilder(true);
    singletonBuilder.recordType(createTypeExpression("number"));
    Assert.assertFalse(singletonBuilder.recordConstructor());
  }

  @Test
  public void testRecordInterface_andCollisions() {
    Assert.assertFalse(builderWithDoc.isInterfaceRecorded());
    Assert.assertTrue(builderWithDoc.recordInterface());
    Assert.assertTrue(builderWithDoc.isInterfaceRecorded());
    Assert.assertTrue(builderWithDoc.isPopulated());

    Assert.assertFalse(builderWithDoc.recordInterface());
    Assert.assertFalse(builderWithDoc.recordConstructor());

    JSDocInfoBuilder singletonBuilder = new JSDocInfoBuilder(true);
    singletonBuilder.recordTypedef(createTypeExpression("string"));
    Assert.assertFalse(singletonBuilder.recordInterface());
  }

  @Test
  public void testRecordPreserveTry() {
    Assert.assertTrue(builderWithDoc.recordPreserveTry());
    Assert.assertTrue(builderWithDoc.isPopulated());
    Assert.assertFalse(builderWithDoc.recordPreserveTry());
  }

  @Test
  public void testRecordOverride() {
    Assert.assertTrue(builderWithDoc.recordOverride());
    Assert.assertTrue(builderWithDoc.isPopulated());
    Assert.assertFalse(builderWithDoc.recordOverride());
  }

  @Test
  public void testRecordNoAlias() {
    Assert.assertTrue(builderWithDoc.recordNoAlias());
    Assert.assertTrue(builderWithDoc.isPopulated());
    Assert.assertFalse(builderWithDoc.recordNoAlias());
  }

  @Test
  public void testRecordDeprecated() {
    Assert.assertTrue(builderWithDoc.recordDeprecated());
    Assert.assertTrue(builderWithDoc.isPopulated());
    Assert.assertFalse(builderWithDoc.recordDeprecated());
  }

  @Test
  public void testRecordExport() {
    Assert.assertTrue(builderWithDoc.recordExport());
    Assert.assertTrue(builderWithDoc.isPopulated());
    Assert.assertFalse(builderWithDoc.recordExport());
  }

  @Test
  public void testRecordNoShadow() {
    Assert.assertTrue(builderWithDoc.recordNoShadow());
    Assert.assertTrue(builderWithDoc.isPopulated());
    Assert.assertFalse(builderWithDoc.recordNoShadow());
  }

  @Test
  public void testRecordImplicitCast() {
    Assert.assertTrue(builderWithDoc.recordImplicitCast());
    Assert.assertTrue(builderWithDoc.isPopulated());
    Assert.assertFalse(builderWithDoc.recordImplicitCast());
  }

  @Test
  public void testRecordNoSideEffects() {
    Assert.assertTrue(builderWithDoc.recordNoSideEffects());
    Assert.assertTrue(builderWithDoc.isPopulated());
    Assert.assertFalse(builderWithDoc.recordNoSideEffects());
  }

  @Test
  public void testRecordImplementedInterface() {
    JSTypeExpression iface = createTypeExpression("Disposable");
    Assert.assertTrue(builderWithDoc.recordImplementedInterface(iface));
    Assert.assertTrue(builderWithDoc.isPopulated());
    Assert.assertFalse(builderWithDoc.recordImplementedInterface(iface));
  }
}
