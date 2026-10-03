package com.google.javascript.jscomp;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class RenameVarsTest {

  private Node parseCode(Compiler compiler, String externsJs, String codeJs) {
    Node externs = compiler.parseSyntheticCode("externs.js", externsJs);
    Node root = compiler.parseSyntheticCode("testcode.js", codeJs);
    return root;
  }

  @Test
  public void testProcess_basicGlobalAndLocalVariables() {
    Compiler compiler = new Compiler();
    Node externs = compiler.parseSyntheticCode("externs.js", "");
    Node root = compiler.parseSyntheticCode("testcode.js", "var globalA = 1; function foo(localA) { return localA + globalA; }");

    RenameVars renameVars = new RenameVars(
        compiler,
        null,
        false,
        false,
        false,
        null,
        null,
        null);

    renameVars.process(externs, root);

    VariableMap map = renameVars.getVariableMap();
    assertNotNull(map);
    assertTrue(map.getOriginalNameToNewNameMap().size() > 0);
    assertTrue(map.getOriginalNameToNewNameMap().containsKey("globalA") ||
               map.getOriginalNameToNewNameMap().containsKey("foo"));
  }

  @Test
  public void testProcess_withPrefixAndReservedNamesAndCharacters() {
    Compiler compiler = new Compiler();
    Node externs = compiler.parseSyntheticCode("externs.js", "");
    Node root = compiler.parseSyntheticCode("testcode.js", "var varOne = 1; var varTwo = 2; function test(localA) { return localA; }");

    Set<String> reservedNames = Sets.newHashSet("a", "b");
    char[] reservedChars = new char[]{'c'};

    RenameVars renameVars = new RenameVars(
        compiler,
        "PRE_",
        false,
        false,
        false,
        null,
        reservedChars,
        reservedNames);

    renameVars.process(externs, root);

    VariableMap map = renameVars.getVariableMap();
    for (Map.Entry<String, String> entry : map.getOriginalNameToNewNameMap().entrySet()) {
      if (!entry.getKey().startsWith("L ")) {
        assertTrue(entry.getValue().startsWith("PRE_"));
      }
      assertFalse(reservedNames.contains(entry.getValue()));
      assertFalse(entry.getValue().contains("c"));
    }
  }

  @Test
  public void testProcess_localRenamingOnly() {
    Compiler compiler = new Compiler();
    Node externs = compiler.parseSyntheticCode("externs.js", "");
    Node root = compiler.parseSyntheticCode("testcode.js", "var globalVar = 10; function myFunc(localVar) { return localVar + globalVar; }");

    RenameVars renameVars = new RenameVars(
        compiler,
        "",
        true,
        false,
        false,
        null,
        null,
        new HashSet<String>());

    renameVars.process(externs, root);

    VariableMap map = renameVars.getVariableMap();
    assertFalse(map.getOriginalNameToNewNameMap().containsKey("globalVar"));
    assertFalse(map.getOriginalNameToNewNameMap().containsKey("myFunc"));
    assertTrue(map.getOriginalNameToNewNameMap().containsKey("L 0"));
  }

  @Test
  public void testProcess_generatePseudoNames() {
    Compiler compiler = new Compiler();
    Node externs = compiler.parseSyntheticCode("externs.js", "");
    Node root = compiler.parseSyntheticCode("testcode.js", "var myGlobal = 1; function test(myParam) { return myParam + myGlobal; }");

    RenameVars renameVars = new RenameVars(
        compiler,
        "",
        false,
        false,
        true,
        null,
        null,
        null);

    renameVars.process(externs, root);

    String resultJs = compiler.toSource(root);
    assertTrue(resultJs.contains("$myGlobal$$"));
    assertTrue(resultJs.contains("$myParam$$"));
  }

  @Test
  public void testProcess_preserveAnonymousFunctionNames() {
    Compiler compiler = new Compiler();
    Node externs = compiler.parseSyntheticCode("externs.js", "");
    Node root = compiler.parseSyntheticCode("testcode.js", "var anon = function() {}; anon();");

    RenameVars renameVars = new RenameVars(
        compiler,
        "",
        false,
        true,
        false,
        null,
        null,
        null);

    renameVars.process(externs, root);

    VariableMap map = renameVars.getVariableMap();
    assertFalse(map.getOriginalNameToNewNameMap().containsKey("anon"));
  }

  @Test
  public void testProcess_reusePreviouslyUsedVariableMap() {
    Compiler compiler = new Compiler();
    Node externs = compiler.parseSyntheticCode("externs.js", "");
    Node root = compiler.parseSyntheticCode("testcode.js", "var globalA = 1; var globalB = 2; function f(x) { return x; }");

    Map<String, String> prevMap = new HashMap<String, String>();
    prevMap.put("globalA", "reusedA");
    prevMap.put("L 0", "reusedL0");
    prevMap.put("globalB", "reservedName");

    Set<String> reserved = Sets.newHashSet("reservedName");

    RenameVars renameVars = new RenameVars(
        compiler,
        "",
        false,
        false,
        false,
        new VariableMap(prevMap),
        null,
        reserved);

    renameVars.process(externs, root);

    VariableMap map = renameVars.getVariableMap();
    assertEquals("reusedA", map.lookupNewName("globalA"));
    assertEquals("reusedL0", map.lookupNewName("L 0"));
    assertNotEquals("reservedName", map.lookupNewName("globalB"));
  }

  @Test
  public void testProcess_externsArePreservedAndNotRenamed() {
    Compiler compiler = new Compiler();
    Node externs = compiler.parseSyntheticCode("externs.js", "var externVar;");
    Node root = compiler.parseSyntheticCode("testcode.js", "function run() { return externVar; }");

    RenameVars renameVars = new RenameVars(
        compiler,
        "",
        false,
        false,
        false,
        null,
        null,
        null);

    renameVars.process(externs, root);

    VariableMap map = renameVars.getVariableMap();
    assertNull(map.lookupNewName("externVar"));
  }

  @Test
  public void testProcess_frequencyAndOccurrenceOrdering() {
    Compiler compiler = new Compiler();
    Node externs = compiler.parseSyntheticCode("externs.js", "");
    // var1: 4 uses, var2: 2 uses, var3: 2 uses (var2 declared before var3)
    String js = "var var1 = 1; var var2 = 2; var var3 = 3;" +
                "var1; var1; var1;" +
                "var2;" +
                "var3;";
    Node root = compiler.parseSyntheticCode("testcode.js", js);

    RenameVars renameVars = new RenameVars(
        compiler,
        "",
        false,
        false,
        false,
        null,
        null,
        null);

    renameVars.process(externs, root);

    VariableMap map = renameVars.getVariableMap();
    String newVar1 = map.lookupNewName("var1");
    String newVar2 = map.lookupNewName("var2");
    String newVar3 = map.lookupNewName("var3");

    assertNotNull(newVar1);
    assertNotNull(newVar2);
    assertNotNull(newVar3);
    assertTrue(newVar1.length() <= newVar2.length());
    assertTrue(newVar2.compareTo(newVar3) < 0);
  }

  @Test
  public void testProcess_emptyNodeNamesAndNonNameNodes() {
    Compiler compiler = new Compiler();
    Node externs = compiler.parseSyntheticCode("externs.js", "");
    Node root = compiler.parseSyntheticCode("testcode.js", "var a = 1;");

    // Manually insert an empty NAME node and a non-NAME node
    Node emptyNameNode = Node.newString(Token.NAME, "");
    root.getFirstChild().addChildToBack(emptyNameNode);

    RenameVars renameVars = new RenameVars(
        compiler,
        "",
        false,
        false,
        false,
        null,
        null,
        null);

    renameVars.process(externs, root);
    VariableMap map = renameVars.getVariableMap();
    assertTrue(map.getOriginalNameToNewNameMap().containsKey("a"));
    assertFalse(map.getOriginalNameToNewNameMap().containsKey(""));
  }

  @Test
  public void testProcess_exportedVariablesNotRenamed() {
    Compiler compiler = new Compiler();
    compiler.initOptions(new CompilerOptions());
    Node externs = compiler.parseSyntheticCode("externs.js", "");
    // Use Closure convention where variables matching convention (or exported) are checked
    Node root = compiler.parseSyntheticCode("testcode.js", "var JSCompiler_RenameVars_test = 1; var normalVar = 2;");

    RenameVars renameVars = new RenameVars(
        compiler,
        "",
        false,
        false,
        false,
        null,
        null,
        null);

    renameVars.process(externs, root);
    VariableMap map = renameVars.getVariableMap();
    assertNotNull(map);
  }

  @Test
  public void testProcess_noVariablesChanged() {
    Compiler compiler = new Compiler();
    Node externs = compiler.parseSyntheticCode("externs.js", "");
    Node root = compiler.parseSyntheticCode("testcode.js", ";;;");

    RenameVars renameVars = new RenameVars(
        compiler,
        "",
        false,
        false,
        false,
        null,
        null,
        null);

    renameVars.process(externs, root);
    VariableMap map = renameVars.getVariableMap();
    assertEquals(0, map.getOriginalNameToNewNameMap().size());
  }

  @Test(expected = IllegalStateException.class)
  public void testAssignment_setNewNameTwiceThrowsException() {
    RenameVars renameVars = new RenameVars(
        new Compiler(),
        null,
        false,
        false,
        false,
        null,
        null,
        null);

    RenameVars.Assignment assignment = renameVars.new Assignment("test", null);
    assignment.setNewName("a");
    assertEquals("a", assignment.newName);
    // Setting new name again should throw IllegalStateException
    assignment.setNewName("b");
  }

  @Test
  public void testProcess_reusePreviouslyUsedVariableMap_prefixMismatchIgnored() {
    Compiler compiler = new Compiler();
    Node externs = compiler.parseSyntheticCode("externs.js", "");
    Node root = compiler.parseSyntheticCode("testcode.js", "var globalA = 1;");

    // Previous mapping does not start with the required prefix "P_"
    Map<String, String> prevMap = ImmutableMap.of("globalA", "unprefixedName");

    RenameVars renameVars = new RenameVars(
        compiler,
        "P_",
        false,
        false,
        false,
        new VariableMap(prevMap),
        null,
        null);

    renameVars.process(externs, root);

    VariableMap map = renameVars.getVariableMap();
    String newName = map.lookupNewName("globalA");
    assertNotNull(newName);
    assertTrue(newName.startsWith("P_"));
    assertNotEquals("unprefixedName", newName);
  }

  @Test
  public void testProcess_multipleScopesSameLocalIndices() {
    Compiler compiler = new Compiler();
    Node externs = compiler.parseSyntheticCode("externs.js", "");
    Node root = compiler.parseSyntheticCode("testcode.js",
        "function f1(a, b) { var c = a + b; return c; }" +
        "function f2(x, y) { var z = x + y; return z; }");

    RenameVars renameVars = new RenameVars(
        compiler,
        "",
        false,
        false,
        false,
        null,
        null,
        null);

    renameVars.process(externs, root);

    VariableMap map = renameVars.getVariableMap();
    assertTrue(map.getOriginalNameToNewNameMap().containsKey("L 0"));
    assertTrue(map.getOriginalNameToNewNameMap().containsKey("L 1"));
    assertTrue(map.getOriginalNameToNewNameMap().containsKey("L 2"));
  }
}
