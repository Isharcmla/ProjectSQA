package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DiagnosticGroupsTest {

    private DiagnosticGroups diagnosticGroups;

    @Before
    public void setUp() {
        diagnosticGroups = new DiagnosticGroups();
    }

    @Test
    public void testConstructor_normalCase_createsInstance() {
        DiagnosticGroups dg = new DiagnosticGroups();
        assertNotNull(dg);
    }

    @Test
    public void testGetRegisteredGroups_normalCase_returnsNonEmptyMap() {
        Map<String, DiagnosticGroup> groups = diagnosticGroups.getRegisteredGroups();
        assertNotNull(groups);
        assertFalse(groups.isEmpty());
    }

    @Test
    public void testGetRegisteredGroups_containsKnownGroups_true() {
        Map<String, DiagnosticGroup> groups = diagnosticGroups.getRegisteredGroups();
        assertTrue(groups.containsKey("globalThis"));
        assertTrue(groups.containsKey("deprecated"));
        assertTrue(groups.containsKey("visibility"));
        assertTrue(groups.containsKey("constantProperty"));
        assertTrue(groups.containsKey("nonStandardJsDocs"));
        assertTrue(groups.containsKey("accessControls"));
        assertTrue(groups.containsKey("invalidCasts"));
        assertTrue(groups.containsKey("fileoverviewTags"));
        assertTrue(groups.containsKey("strictModuleDepCheck"));
        assertTrue(groups.containsKey("externsValidation"));
        assertTrue(groups.containsKey("ambiguousFunctionDecl"));
        assertTrue(groups.containsKey("unknownDefines"));
        assertTrue(groups.containsKey("tweakValidation"));
        assertTrue(groups.containsKey("missingProperties"));
        assertTrue(groups.containsKey("internetExplorerChecks"));
        assertTrue(groups.containsKey("undefinedVars"));
        assertTrue(groups.containsKey("checkRegExp"));
        assertTrue(groups.containsKey("checkTypes"));
        assertTrue(groups.containsKey("checkVars"));
        assertTrue(groups.containsKey("uselessCode"));
        assertTrue(groups.containsKey("typeInvalidation"));
    }

    @Test
    public void testGetRegisteredGroups_notContainsUnknownKey_false() {
        Map<String, DiagnosticGroup> groups = diagnosticGroups.getRegisteredGroups();
        assertFalse(groups.containsKey("thisGroupDoesNotExist"));
    }

    @Test
    public void testGetRegisteredGroups_isImmutable_throwsException() {
        Map<String, DiagnosticGroup> groups = diagnosticGroups.getRegisteredGroups();
        try {
            groups.put("newGroup", DiagnosticGroups.GLOBAL_THIS);
            fail("Expected UnsupportedOperationException");
        } catch (UnsupportedOperationException e) {
            // expected
        }
    }

    @Test
    public void testForName_existingName_returnsCorrectGroup() {
        DiagnosticGroup group = diagnosticGroups.forName("globalThis");
        assertNotNull(group);
        assertEquals(DiagnosticGroups.GLOBAL_THIS, group);
    }

    @Test
    public void testForName_anotherExistingName_returnsCorrectGroup() {
        DiagnosticGroup group = diagnosticGroups.forName("checkTypes");
        assertNotNull(group);
        assertEquals(DiagnosticGroups.CHECK_TYPES, group);
    }

    @Test
    public void testForName_nonExistingName_returnsNull() {
        DiagnosticGroup group = diagnosticGroups.forName("nonExistentGroupName");
        assertNull(group);
    }

    @Test
    public void testForName_emptyString_returnsNull() {
        DiagnosticGroup group = diagnosticGroups.forName("");
        assertNull(group);
    }

    @Test
    public void testForName_nullName_returnsNull() {
        DiagnosticGroup group = diagnosticGroups.forName(null);
        assertNull(group);
    }

    @Test
    public void testSetWarningLevels_normalCase_noExceptionThrown() {
        CompilerOptions options = new CompilerOptions();
        List<String> names = new ArrayList<String>();
        names.add("globalThis");
        diagnosticGroups.setWarningLevels(options, names, CheckLevel.WARNING);
    }

    @Test
    public void testSetWarningLevels_emptyList_noExceptionThrown() {
        CompilerOptions options = new CompilerOptions();
        List<String> names = new ArrayList<String>();
        diagnosticGroups.setWarningLevels(options, names, CheckLevel.WARNING);
    }

    @Test
    public void testSetWarningLevels_multipleNames_noExceptionThrown() {
        CompilerOptions options = new CompilerOptions();
        List<String> names = new ArrayList<String>();
        names.add("globalThis");
        names.add("deprecated");
        names.add("visibility");
        diagnosticGroups.setWarningLevels(options, names, CheckLevel.ERROR);
    }

    @Test
    public void testSetWarningLevels_checkLevelOff_noExceptionThrown() {
        CompilerOptions options = new CompilerOptions();
        List<String> names = new ArrayList<String>();
        names.add("checkTypes");
        diagnosticGroups.setWarningLevels(options, names, CheckLevel.OFF);
    }

    @Test(expected = NullPointerException.class)
    public void testSetWarningLevels_invalidName_throwsNullPointerException() {
        CompilerOptions options = new CompilerOptions();
        List<String> names = new ArrayList<String>();
        names.add("nonExistentGroupName");
        diagnosticGroups.setWarningLevels(options, names, CheckLevel.WARNING);
    }

    @Test(expected = NullPointerException.class)
    public void testSetWarningLevels_emptyStringName_throwsNullPointerException() {
        CompilerOptions options = new CompilerOptions();
        List<String> names = new ArrayList<String>();
        names.add("");
        diagnosticGroups.setWarningLevels(options, names, CheckLevel.WARNING);
    }

    @Test(expected = NullPointerException.class)
    public void testSetWarningLevels_nullOptions_throwsNullPointerException() {
        CompilerOptions options = null;
        List<String> names = new ArrayList<String>();
        names.add("globalThis");
        diagnosticGroups.setWarningLevels(options, names, CheckLevel.WARNING);
    }

    @Test
    public void testStaticFields_allGroupsNotNull_verified() {
        assertNotNull(DiagnosticGroups.GLOBAL_THIS);
        assertNotNull(DiagnosticGroups.DEPRECATED);
        assertNotNull(DiagnosticGroups.VISIBILITY);
        assertNotNull(DiagnosticGroups.CONSTANT_PROPERTY);
        assertNotNull(DiagnosticGroups.NON_STANDARD_JSDOC);
        assertNotNull(DiagnosticGroups.ACCESS_CONTROLS);
        assertNotNull(DiagnosticGroups.INVALID_CASTS);
        assertNotNull(DiagnosticGroups.FILEOVERVIEW_JSDOC);
        assertNotNull(DiagnosticGroups.STRICT_MODULE_DEP_CHECK);
        assertNotNull(DiagnosticGroups.EXTERNS_VALIDATION);
        assertNotNull(DiagnosticGroups.AMBIGUOUS_FUNCTION_DECL);
        assertNotNull(DiagnosticGroups.UNKNOWN_DEFINES);
        assertNotNull(DiagnosticGroups.TWEAKS);
        assertNotNull(DiagnosticGroups.MISSING_PROPERTIES);
        assertNotNull(DiagnosticGroups.INTERNET_EXPLORER_CHECKS);
        assertNotNull(DiagnosticGroups.UNDEFINED_VARIABLES);
        assertNotNull(DiagnosticGroups.CHECK_REGEXP);
        assertNotNull(DiagnosticGroups.CHECK_TYPES);
        assertNotNull(DiagnosticGroups.CHECK_VARIABLES);
        assertNotNull(DiagnosticGroups.CHECK_USELESS_CODE);
        assertNotNull(DiagnosticGroups.TYPE_INVALIDATION);
    }

    @Test
    public void testRegisterGroup_withDiagnosticGroupVariant_registeredCorrectly() {
        Map<String, DiagnosticGroup> groups = diagnosticGroups.getRegisteredGroups();
        DiagnosticGroup accessControls = groups.get("accessControls");
        assertNotNull(accessControls);
        assertEquals(DiagnosticGroups.ACCESS_CONTROLS, accessControls);
    }

    @Test
    public void testRegisterGroup_withDiagnosticTypeVariant_registeredCorrectly() {
        Map<String, DiagnosticGroup> groups = diagnosticGroups.getRegisteredGroups();
        DiagnosticGroup globalThis = groups.get("globalThis");
        assertNotNull(globalThis);
        assertEquals(DiagnosticGroups.GLOBAL_THIS, globalThis);
    }
}
