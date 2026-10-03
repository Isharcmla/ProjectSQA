package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class RenamePrototypesTest {

  private Compiler createCompiler() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    compiler.setLifeCycleStage(AbstractCompiler.LifeCycleStage.NORMALIZED);
    return compiler;
  }

  @Test(expected = IllegalStateException.class)
  public void testProcess_notNormalized_throwsIllegalStateException() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    compiler.setLifeCycleStage(AbstractCompiler.LifeCycleStage.RAW);

    Node externs = compiler.parseTestCode("");
    Node root = compiler.parseTestCode("");
    RenamePrototypes rp = new RenamePrototypes(compiler, true, null, null);
    rp.process(externs, root);
  }

  @Test
  public void testProcess_emptyRootAndExterns_success() {
    Compiler compiler = createCompiler();
    Node externs = compiler.parseTestCode("");
    Node root = compiler.parseTestCode("");

    RenamePrototypes rp = new RenamePrototypes(compiler, true, null, null);
    rp.process(externs, root);

    Assert.assertEquals(AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED, compiler.getLifeCycleStage());
    Assert.assertTrue(rp.getPropertyMap().toMap().isEmpty());
  }

  @Test
  public void testProcess_aggressiveRenaming_renamesAllPrototypeProperties() {
    Compiler compiler = createCompiler();
    Node externs = compiler.parseTestCode("");
    String js = "function Foo() {} Foo.prototype.simple = 1; Foo.prototype.another = 2;";
    Node root = compiler.parseTestCode(js);

    RenamePrototypes rp = new RenamePrototypes(compiler, true, null, null);
    rp.process(externs, root);

    VariableMap map = rp.getPropertyMap();
    Assert.assertTrue(map.toMap().containsKey("simple"));
    Assert.assertTrue(map.toMap().containsKey("another"));
    Assert.assertEquals(AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED, compiler.getLifeCycleStage());
  }

  @Test
  public void testProcess_nonAggressiveRenaming_heuristicFiltering() {
    Compiler compiler = createCompiler();
    Node externs = compiler.parseTestCode("");
    // "alllower" has only lowercase chars -> should NOT be renamed in non-aggressive
    // "camelCase" has uppercase char -> should be renamed
    // "with_underscore" has non-letter char -> should be renamed
    // "with1digit" has digit char -> should be renamed
    String js = "function Foo() {}\n"
        + "Foo.prototype.alllower = 1;\n"
        + "Foo.prototype.camelCase = 2;\n"
        + "Foo.prototype.with_underscore = 3;\n"
        + "Foo.prototype.with1digit = 4;\n";
    Node root = compiler.parseTestCode(js);

    RenamePrototypes rp = new RenamePrototypes(compiler, false, null, null);
    rp.process(externs, root);

    VariableMap map = rp.getPropertyMap();
    Assert.assertFalse(map.toMap().containsKey("alllower"));
    Assert.assertTrue(map.toMap().containsKey("camelCase"));
    Assert.assertTrue(map.toMap().containsKey("with_underscore"));
    Assert.assertTrue(map.toMap().containsKey("with1digit"));
  }

  @Test
  public void testProcess_externedProperties_notRenamed() {
    Compiler compiler = createCompiler();
    Node externs = compiler.parseTestCode("var window; window.externProp = 1; window['externElem'] = 2;");
    Node root = compiler.parseTestCode("function Foo() {} Foo.prototype.externProp = 1; Foo.prototype.externElem = 2; Foo.prototype.localProp = 3;");

    RenamePrototypes rp = new RenamePrototypes(compiler, true, null, null);
    rp.process(externs, root);

    VariableMap map = rp.getPropertyMap();
    Assert.assertFalse(map.toMap().containsKey("externProp"));
    Assert.assertFalse(map.toMap().containsKey("externElem"));
    Assert.assertTrue(map.toMap().containsKey("localProp"));
  }

  @Test
  public void testProcess_builtInReservedProperties_notRenamed() {
    Compiler compiler = createCompiler();
    Node externs = compiler.parseTestCode("");
    Node root = compiler.parseTestCode("function Foo() {} Foo.prototype.toString = function() {}; Foo.prototype.indexOf = function() {};");

    RenamePrototypes rp = new RenamePrototypes(compiler, true, null, null);
    rp.process(externs, root);

    VariableMap map = rp.getPropertyMap();
    Assert.assertFalse(map.toMap().containsKey("toString"));
    Assert.assertFalse(map.toMap().containsKey("indexOf"));
  }

  @Test
  public void testProcess_prototypeObjLitAssignAndCall_renamesCorrectly() {
    Compiler compiler = createCompiler();
    Node externs = compiler.parseTestCode("");
    String js = "function Foo() {}\n"
        + "Foo.prototype = { 'methodA': function() {}, 123: 'numericKey' };\n"
        + "Object.assign(Foo.prototype, { 'methodB': function() {}, 456: 'num' });\n";
    Node root = compiler.parseTestCode(js);

    RenamePrototypes rp = new RenamePrototypes(compiler, true, null, null);
    rp.process(externs, root);

    VariableMap map = rp.getPropertyMap();
    Assert.assertTrue(map.toMap().containsKey("methodA"));
    Assert.assertTrue(map.toMap().containsKey("methodB"));
  }

  @Test
  public void testProcess_objLitProperties_onlyPrivateRenamed() {
    Compiler compiler = createCompiler();
    Node externs = compiler.parseTestCode("");
    // Default coding convention treats trailing underscore as private
    String js = "var obj = { normalKey: 1, privateKey_: 2, 999: 3 };";
    Node root = compiler.parseTestCode(js);

    RenamePrototypes rp = new RenamePrototypes(compiler, true, null, null);
    rp.process(externs, root);

    VariableMap map = rp.getPropertyMap();
    Assert.assertFalse(map.toMap().containsKey("normalKey"));
    Assert.assertTrue(map.toMap().containsKey("privateKey_"));
  }

  @Test
  public void testProcess_bothPrototypeAndObjLit_onlyPrivateRenamed() {
    Compiler compiler = createCompiler();
    Node externs = compiler.parseTestCode("");
    String js = "function Foo() {} Foo.prototype.sharedPublic = 1; var o1 = { sharedPublic: 2 };\n"
        + "Foo.prototype.sharedPrivate_ = 3; var o2 = { sharedPrivate_: 4 };";
    Node root = compiler.parseTestCode(js);

    RenamePrototypes rp = new RenamePrototypes(compiler, true, null, null);
    rp.process(externs, root);

    VariableMap map = rp.getPropertyMap();
    Assert.assertFalse(map.toMap().containsKey("sharedPublic"));
    Assert.assertTrue(map.toMap().containsKey("sharedPrivate_"));
  }

  @Test
  public void testProcess_runtimePropertyAccessOnly_renamedIfPrivate() {
    Compiler compiler = createCompiler();
    Node externs = compiler.parseTestCode("");
    String js = "var obj = {}; obj.runtimeProp_ = 10; obj.normalRuntime = 20;";
    Node root = compiler.parseTestCode(js);

    RenamePrototypes rp = new RenamePrototypes(compiler, true, null, null);
    rp.process(externs, root);

    VariableMap map = rp.getPropertyMap();
    Assert.assertTrue(map.toMap().containsKey("runtimeProp_"));
    Assert.assertFalse(map.toMap().containsKey("normalRuntime"));
  }

  @Test
  public void testProcess_prevUsedRenameMap_reusedWhenAvailableAndNotReserved() {
    Compiler compiler = createCompiler();
    Node externs = compiler.parseTestCode("");
    String js = "function Foo() {} Foo.prototype.propAlpha = 1; Foo.prototype.propBeta = 2;";
    Node root = compiler.parseTestCode(js);

    Map<String, String> prevMap = new HashMap<String, String>();
    prevMap.put("propAlpha", "customA");
    prevMap.put("propBeta", "toString"); // "toString" is reserved, should be skipped
    VariableMap prevVariableMap = new VariableMap(prevMap);

    RenamePrototypes rp = new RenamePrototypes(compiler, true, null, prevVariableMap);
    rp.process(externs, root);

    VariableMap map = rp.getPropertyMap();
    Assert.assertEquals("customA", map.lookupNewName("propAlpha"));
    Assert.assertNotNull(map.lookupNewName("propBeta"));
    Assert.assertNotEquals("toString", map.lookupNewName("propBeta"));
  }

  @Test
  public void testProcess_withReservedCharacters_doesNotUseReservedChars() {
    Compiler compiler = createCompiler();
    Node externs = compiler.parseTestCode("");
    String js = "function Foo() {}\n"
        + "Foo.prototype.propOne = 1;\n"
        + "Foo.prototype.propTwo = 2;\n"
        + "Foo.prototype.propThree = 3;\n";
    Node root = compiler.parseTestCode(js);

    char[] reservedChars = new char[]{'a', 'b', 'c'};
    RenamePrototypes rp = new RenamePrototypes(compiler, true, reservedChars, null);
    rp.process(externs, root);

    VariableMap map = rp.getPropertyMap();
    for (String newName : map.toMap().values()) {
      for (char ch : reservedChars) {
        Assert.assertFalse("New name '" + newName + "' contains reserved char '" + ch + "'",
            newName.indexOf(ch) >= 0);
      }
    }
  }

  @Test
  public void testProcess_frequencyOrderingAndTies() {
    Compiler compiler = createCompiler();
    Node externs = compiler.parseTestCode("");
    // propZ has count 3, propA has count 1, propB has count 1
    String js = "function Foo() {}\n"
        + "Foo.prototype.propZ = 1; Foo.prototype.propZ = 2; Foo.prototype.propZ = 3;\n"
        + "Foo.prototype.propA = 1;\n"
        + "Foo.prototype.propB = 1;\n";
    Node root = compiler.parseTestCode(js);

    RenamePrototypes rp = new RenamePrototypes(compiler, true, null, null);
    rp.process(externs, root);

    VariableMap map = rp.getPropertyMap();
    Assert.assertTrue(map.toMap().containsKey("propZ"));
    Assert.assertTrue(map.toMap().containsKey("propA"));
    Assert.assertTrue(map.toMap().containsKey("propB"));
  }

  @Test
  public void testProcess_getElemPrototype_renamesElementAccess() {
    Compiler compiler = createCompiler();
    Node externs = compiler.parseTestCode("");
    String js = "function Foo() {} Foo['prototype']['computedProp'] = 1;";
    Node root = compiler.parseTestCode(js);

    RenamePrototypes rp = new RenamePrototypes(compiler, true, null, null);
    rp.process(externs, root);

    VariableMap map = rp.getPropertyMap();
    Assert.assertTrue(map.toMap().containsKey("computedProp"));
  }
}
