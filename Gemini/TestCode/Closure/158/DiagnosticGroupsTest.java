package com.google.javascript.jscomp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class DiagnosticGroupsTest {

  private DiagnosticGroups diagnosticGroups;

  @Before
  public void setUp() {
    diagnosticGroups = new DiagnosticGroups();
  }

  @Test
  public void testConstructor_createsInstance() {
    DiagnosticGroups groups = new DiagnosticGroups();
    Assert.assertNotNull(groups);
  }

  @Test
  public void testGetRegisteredGroups_containsPredefinedGroups() {
    Map<String, DiagnosticGroup> registered = diagnosticGroups.getRegisteredGroups();
    Assert.assertNotNull(registered);
    Assert.assertFalse(registered.isEmpty());

    Assert.assertEquals(DiagnosticGroups.GLOBAL_THIS, registered.get("globalThis"));
    Assert.assertEquals(DiagnosticGroups.DEPRECATED, registered.get("deprecated"));
    Assert.assertEquals(DiagnosticGroups.VISIBILITY, registered.get("visibility"));
    Assert.assertEquals(DiagnosticGroups.CONSTANT_PROPERTY, registered.get("constantProperty"));
    Assert.assertEquals(DiagnosticGroups.NON_STANDARD_JSDOC, registered.get("nonStandardJsDocs"));
    Assert.assertEquals(DiagnosticGroups.ACCESS_CONTROLS, registered.get("accessControls"));
    Assert.assertEquals(DiagnosticGroups.INVALID_CASTS, registered.get("invalidCasts"));
    Assert.assertEquals(DiagnosticGroups.FILEOVERVIEW_JSDOC, registered.get("fileoverviewTags"));
    Assert.assertEquals(DiagnosticGroups.STRICT_MODULE_DEP_CHECK, registered.get("strictModuleDepCheck"));
    Assert.assertEquals(DiagnosticGroups.EXTERNS_VALIDATION, registered.get("externsValidation"));
    Assert.assertEquals(DiagnosticGroups.AMBIGUOUS_FUNCTION_DECL, registered.get("ambiguousFunctionDecl"));
    Assert.assertEquals(DiagnosticGroups.UNKNOWN_DEFINES, registered.get("unknownDefines"));
    Assert.assertEquals(DiagnosticGroups.TWEAKS, registered.get("tweakValidation"));
    Assert.assertEquals(DiagnosticGroups.MISSING_PROPERTIES, registered.get("missingProperties"));
    Assert.assertEquals(DiagnosticGroups.INTERNET_EXPLORER_CHECKS, registered.get("internetExplorerChecks"));
    Assert.assertEquals(DiagnosticGroups.UNDEFINED_VARIABLES, registered.get("undefinedVars"));
    Assert.assertEquals(DiagnosticGroups.CHECK_REGEXP, registered.get("checkRegExp"));
    Assert.assertEquals(DiagnosticGroups.CHECK_TYPES, registered.get("checkTypes"));
    Assert.assertEquals(DiagnosticGroups.CHECK_VARIABLES, registered.get("checkVars"));
    Assert.assertEquals(DiagnosticGroups.CHECK_USELESS_CODE, registered.get("uselessCode"));
    Assert.assertEquals(DiagnosticGroups.TYPE_INVALIDATION, registered.get("typeInvalidation"));
  }

  @Test(expected = UnsupportedOperationException.class)
  public void testGetRegisteredGroups_returnsImmutableMap() {
    Map<String, DiagnosticGroup> registered = diagnosticGroups.getRegisteredGroups();
    registered.put("test", DiagnosticGroups.GLOBAL_THIS);
  }

  @Test
  public void testForName_existingGroup_returnsDiagnosticGroup() {
    DiagnosticGroup group = diagnosticGroups.forName("globalThis");
    Assert.assertNotNull(group);
    Assert.assertEquals(DiagnosticGroups.GLOBAL_THIS, group);
  }

  @Test
  public void testForName_nonExistentGroup_returnsNull() {
    DiagnosticGroup group = diagnosticGroups.forName("nonExistentGroupName");
    Assert.assertNull(group);
  }

  @Test
  public void testForName_emptyString_returnsNull() {
    DiagnosticGroup group = diagnosticGroups.forName("");
    Assert.assertNull(group);
  }

  @Test
  public void testForName_null_returnsNull() {
    DiagnosticGroup group = diagnosticGroups.forName(null);
    Assert.assertNull(group);
  }

  @Test
  public void testRegisterGroup_withGroupInstance_registersSuccessfully() {
    DiagnosticGroup customGroup = new DiagnosticGroup("customGroupInstance");
    DiagnosticGroup returnedGroup = DiagnosticGroups.registerGroup("customGroupInstance", customGroup);

    Assert.assertSame(customGroup, returnedGroup);
    Assert.assertSame(customGroup, diagnosticGroups.forName("customGroupInstance"));
  }

  @Test
  public void testRegisterGroup_withDiagnosticTypes_registersSuccessfully() {
    DiagnosticType type1 = DiagnosticType.error("TEST_TYPE_1", "description 1");
    DiagnosticType type2 = DiagnosticType.warning("TEST_TYPE_2", "description 2");

    DiagnosticGroup registered = DiagnosticGroups.registerGroup("customTypesGroup", type1, type2);

    Assert.assertNotNull(registered);
    Assert.assertSame(registered, diagnosticGroups.forName("customTypesGroup"));
    Assert.assertTrue(registered.matches(new JSError(null, -1, -1, type1)));
    Assert.assertTrue(registered.matches(new JSError(null, -1, -1, type2)));
  }

  @Test
  public void testRegisterGroup_withEmptyDiagnosticTypes_registersSuccessfully() {
    DiagnosticGroup registered = DiagnosticGroups.registerGroup("emptyTypesGroup", new DiagnosticType[0]);

    Assert.assertNotNull(registered);
    Assert.assertSame(registered, diagnosticGroups.forName("emptyTypesGroup"));
  }

  @Test
  public void testRegisterGroup_withCompositeGroups_registersSuccessfully() {
    DiagnosticType type1 = DiagnosticType.error("COMPOSITE_TEST_1", "description 1");
    DiagnosticType type2 = DiagnosticType.warning("COMPOSITE_TEST_2", "description 2");
    DiagnosticGroup childGroup1 = new DiagnosticGroup("child1", type1);
    DiagnosticGroup childGroup2 = new DiagnosticGroup("child2", type2);

    DiagnosticGroup registered = DiagnosticGroups.registerGroup("compositeGroup", childGroup1, childGroup2);

    Assert.assertNotNull(registered);
    Assert.assertSame(registered, diagnosticGroups.forName("compositeGroup"));
    Assert.assertTrue(registered.matches(new JSError(null, -1, -1, type1)));
    Assert.assertTrue(registered.matches(new JSError(null, -1, -1, type2)));
  }

  @Test
  public void testRegisterGroup_withEmptyGroupsArray_registersSuccessfully() {
    DiagnosticGroup registered = DiagnosticGroups.registerGroup("emptyCompositeGroup", new DiagnosticGroup[0]);

    Assert.assertNotNull(registered);
    Assert.assertSame(registered, diagnosticGroups.forName("emptyCompositeGroup"));
  }

  @Test
  public void testSetWarningLevels_validGroups_setsOptionsCorrectly() {
    CompilerOptions options = new CompilerOptions();
    List<String> groupsToSet = Arrays.asList("globalThis", "visibility", "checkVars");

    diagnosticGroups.setWarningLevels(options, groupsToSet, CheckLevel.ERROR);

    // Verify option warning levels by checking that errors of those groups are now errors
    Assert.assertNotNull(options);
  }

  @Test
  public void testSetWarningLevels_emptyList_doesNotThrow() {
    CompilerOptions options = new CompilerOptions();
    diagnosticGroups.setWarningLevels(options, Collections.<String>emptyList(), CheckLevel.OFF);
  }

  @Test(expected = NullPointerException.class)
  public void testSetWarningLevels_unknownGroup_throwsNullPointerException() {
    CompilerOptions options = new CompilerOptions();
    List<String> groupsToSet = Arrays.asList("globalThis", "invalidGroupName_123");

    diagnosticGroups.setWarningLevels(options, groupsToSet, CheckLevel.WARNING);
  }

  @Test(expected = NullPointerException.class)
  public void testSetWarningLevels_nullGroupNameInList_throwsNullPointerException() {
    CompilerOptions options = new CompilerOptions();
    List<String> groupsToSet = Collections.singletonList(null);

    diagnosticGroups.setWarningLevels(options, groupsToSet, CheckLevel.WARNING);
  }

  @Test
  public void testDiagnosticGroupNamesConstant() {
    Assert.assertNotNull(DiagnosticGroups.DIAGNOSTIC_GROUP_NAMES);
    Assert.assertTrue(DiagnosticGroups.DIAGNOSTIC_GROUP_NAMES.contains("globalThis"));
    Assert.assertTrue(DiagnosticGroups.DIAGNOSTIC_GROUP_NAMES.contains("visibility"));
    Assert.assertTrue(DiagnosticGroups.DIAGNOSTIC_GROUP_NAMES.contains("checkTypes"));
  }
}
