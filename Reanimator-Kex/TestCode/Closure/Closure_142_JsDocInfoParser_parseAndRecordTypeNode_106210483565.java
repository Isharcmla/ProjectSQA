package com.google.javascript.jscomp.parsing;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;
import java.lang.Integer;
import java.lang.Boolean;

public class JsDocInfoParser_parseAndRecordTypeNode_106210483565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10571;
     Object enum168;
     Object term10769;
     Object term10771;
     Object term10773;
     Object term10775;

    public JsDocInfoParser_parseAndRecordTypeNode_106210483565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term10624 = new HashMap();
        HashMap term10633 = new HashMap();
        Set<Object> term296873 =  ((Map) term10633).keySet();
        HashSet term10632 = new HashSet((Collection<? extends Object>) term296873);
        HashMap term10639 = new HashMap();
        Set<Object> term296874 =  ((Map) term10639).keySet();
        HashSet term10638 = new HashSet((Collection<? extends Object>) term296874);
        HashMap term10646 = new HashMap();
        Set<Object> term296875 =  ((Map) term10646).keySet();
        HashSet term10645 = new HashSet((Collection<? extends Object>) term296875);
        HashMap term10652 = new HashMap();
        HashMap term10657 = new HashMap();
        Class<? extends Object> term296897 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term296896 = ((Class) term296897).getDeclaredField((String) "INHERITED");
        ((Field) term296896).setAccessible(true);
        Object enum166 = ((Field) term296896).get((Object) null);
        Class<? extends Object> term297181 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocInfoParser$State");
        Field term297180 = ((Class) term297181).getDeclaredField((String) "SEARCHING_ANNOTATION");
        ((Field) term297180).setAccessible(true);
        Object enum167 = ((Field) term297180).get((Object) null);
        HashMap term10751 = new HashMap();
        term10571 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term10572 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term10585 = (char[]) newCharArray(5);
        int[] term10592 = (int[]) newIntArray(4);
        Object term10622 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term10623 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 8);
        Object term10678 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term10692 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term10693 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term10694 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term10699 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term10700 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term10704 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term10705 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term10710 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term10723 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser$ErrorReporterParser"));
        Object term10724 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term10762 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        setField(term10572, term10572.getClass(), "string", "bdyhHbDAmJ");
        setCharElement(term10585, 0, 'V');
        setCharElement(term10585, 1, 'm');
        setCharElement(term10585, 2, 'a');
        setCharElement(term10585, 3, 'n');
        setCharElement(term10585, 4, 'W');
        setField(term10572, term10572.getClass(), "stringBuffer", term10585);
        setIntField(term10572, term10572.getClass(), "stringBufferTop", 1152356969);
        setIntElement(term10592, 0, -1667990367);
        setIntElement(term10592, 1, -1214628358);
        setIntElement(term10592, 2, 1102721075);
        setIntElement(term10592, 3, -426764678);
        setField(term10572, term10572.getClass(), "ungetBuffer", term10592);
        setIntField(term10572, term10572.getClass(), "ungetCursor", -1222614956);
        setBooleanField(term10572, term10572.getClass(), "hitEOF", false);
        setIntField(term10572, term10572.getClass(), "lineStart", -1870495012);
        setIntField(term10572, term10572.getClass(), "lineEndChar", -1310015129);
        setIntField(term10572, term10572.getClass(), "lineno", -2104981311);
        setIntField(term10572, term10572.getClass(), "charno", -571169753);
        setIntField(term10572, term10572.getClass(), "initCharno", 318591690);
        setIntField(term10572, term10572.getClass(), "initLineno", -165587447);
        setField(term10572, term10572.getClass(), "sourceString", "BBXiTNHqGE");
        setIntField(term10572, term10572.getClass(), "sourceEnd", -1347358701);
        setIntField(term10572, term10572.getClass(), "sourceCursor", 806595993);
        setIntField(term10572, term10572.getClass(), "cursor", 548228925);
        setIntField(term10572, term10572.getClass(), "tokenBeg", -749861210);
        setIntField(term10572, term10572.getClass(), "tokenEnd", 1694224101);
        setField(term10571, term10571.getClass(), "stream", term10572);
        setField(term10622, term10622.getClass(), "reporter", null);
        setField(term10622, term10622.getClass(), "nativeTypes", term10623);
        setField(term10622, term10622.getClass(), "namesToTypes", term10624);
        setField(term10622, term10622.getClass(), "namespaces", term10632);
        setField(term10622, term10622.getClass(), "enumTypeNames", term10638);
        setField(term10622, term10622.getClass(), "forwardDeclaredTypes", term10645);
        setField(term10622, term10622.getClass(), "typesIndexedByProperty", term10652);
        setField(term10622, term10622.getClass(), "greatestSubtypeByProperty", term10657);
        setField(term10622, term10622.getClass(), "interfaceToImplementors", null);
        setField(term10622, term10622.getClass(), "unresolvedNamedTypes", null);
        setField(term10622, term10622.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term10622, term10622.getClass(), "lastGeneration", true);
        setField(term10622, term10622.getClass(), "templateTypeName", "OzXRsFGTIp");
        setField(term10678, term10678.getClass(), "name", "TjWpyghUWN");
        setField(term10678, term10678.getClass(), "referencedType", null);
        setBooleanField(term10678, term10678.getClass(), "visited", false);
        setField(term10693, term10693.getClass(), "baseType", null);
        setField(term10693, term10693.getClass(), "implementedInterfaces", null);
        setField(term10693, term10693.getClass(), "parameters", null);
        setField(term10693, term10693.getClass(), "thrownTypes", null);
        setField(term10693, term10693.getClass(), "templateTypeName", null);
        setField(term10693, term10693.getClass(), "description", null);
        setField(term10693, term10693.getClass(), "deprecated", null);
        setField(term10693, term10693.getClass(), "license", null);
        setField(term10693, term10693.getClass(), "suppressions", null);
        setField(term10692, term10692.getClass(), "info", term10693);
        setField(term10694, term10694.getClass(), "markers", null);
        setField(term10694, term10694.getClass(), "parameters", null);
        setField(term10694, term10694.getClass(), "throwsDescriptions", null);
        setField(term10694, term10694.getClass(), "blockDescription", null);
        setField(term10694, term10694.getClass(), "fileOverview", null);
        setField(term10694, term10694.getClass(), "returnDescription", null);
        setField(term10694, term10694.getClass(), "version", null);
        setField(term10694, term10694.getClass(), "authors", null);
        setField(term10694, term10694.getClass(), "sees", null);
        setField(term10692, term10692.getClass(), "documentation", term10694);
        setField(term10692, term10692.getClass(), "sourceName", "");
        setField(term10692, term10692.getClass(), "visibility", enum166);
        setIntField(term10692, term10692.getClass(), "bitset", 937859191);
        setField(term10699, term10699.getClass(), "root", null);
        setField(term10699, term10699.getClass(), "sourceName", null);
        setField(term10699, term10699.getClass(), "registry", null);
        setField(term10692, term10692.getClass(), "type", term10699);
        setField(term10700, term10700.getClass(), "root", null);
        setField(term10700, term10700.getClass(), "sourceName", null);
        setField(term10700, term10700.getClass(), "registry", null);
        setField(term10692, term10692.getClass(), "thisType", term10700);
        setBooleanField(term10692, term10692.getClass(), "includeDocumentation", true);
        setField(term10678, term10678.getClass(), "docInfo", term10692);
        setBooleanField(term10678, term10678.getClass(), "unknown", false);
        setBooleanField(term10678, term10678.getClass(), "resolved", false);
        setField(term10678, term10678.getClass(), "resolveResult", null);
        setField(term10678, term10678.getClass(), "registry", null);
        setField(term10622, term10622.getClass(), "templateType", term10678);
        setField(term10571, term10571.getClass(), "typeRegistry", term10622);
        setField(term10705, term10705.getClass(), "info", null);
        setField(term10705, term10705.getClass(), "documentation", null);
        setField(term10705, term10705.getClass(), "sourceName", null);
        setField(term10705, term10705.getClass(), "visibility", null);
        setIntField(term10705, term10705.getClass(), "bitset", 0);
        setField(term10705, term10705.getClass(), "type", null);
        setField(term10705, term10705.getClass(), "thisType", null);
        setBooleanField(term10705, term10705.getClass(), "includeDocumentation", false);
        setField(term10704, term10704.getClass(), "currentInfo", term10705);
        setBooleanField(term10704, term10704.getClass(), "populated", true);
        setBooleanField(term10704, term10704.getClass(), "parseDocumentation", true);
        setField(term10710, term10710.getClass(), "annotation", null);
        setField(term10710, term10710.getClass(), "name", null);
        setField(term10710, term10710.getClass(), "description", null);
        setField(term10710, term10710.getClass(), "type", null);
        setField(term10704, term10704.getClass(), "currentMarker", term10710);
        setField(term10571, term10571.getClass(), "jsdocBuilder", term10704);
        setField(term10571, term10571.getClass(), "sourceName", "UkKvaeJfEC");
        setField(term10571, term10571.getClass(), "errorReporter", null);
        setField(term10723, term10723.getClass(), "this$0", null);
        setField(term10571, term10571.getClass(), "parser", term10723);
        setField(term10724, term10724.getClass(), "info", null);
        setField(term10724, term10724.getClass(), "documentation", null);
        setField(term10724, term10724.getClass(), "sourceName", null);
        setField(term10724, term10724.getClass(), "visibility", null);
        setIntField(term10724, term10724.getClass(), "bitset", 0);
        setField(term10724, term10724.getClass(), "type", null);
        setField(term10724, term10724.getClass(), "thisType", null);
        setBooleanField(term10724, term10724.getClass(), "includeDocumentation", false);
        setField(term10571, term10571.getClass(), "fileOverviewJSDocInfo", term10724);
        setField(term10571, term10571.getClass(), "state", enum167);
        setField(term10571, term10571.getClass(), "annotationNames", term10751);
        setField(term10762, term10762.getClass(), "this$0", null);
        setField(term10571, term10571.getClass(), "fileLevelJsDocBuilder", term10762);
        setField(term10571, term10571.getClass(), "unreadToken", null);
        Class<? extends Object> term297538 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term297537 = ((Class) term297538).getDeclaredField((String) "RP");
        ((Field) term297537).setAccessible(true);
        enum168 = ((Field) term297537).get((Object) null);
        term10769 = new Integer(-2131181468);
        term10771 = new Integer(282916351);
        term10773 = new Boolean(true);
        term10775 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = boolean.class;
        argTypes[4] = boolean.class;
        Object[] args = new Object[5];
        args[0] = enum168;
        args[1] = term10769;
        args[2] = term10771;
        args[3] = term10773;
        args[4] = term10775;
        try {
            callMethod(klass, "parseAndRecordTypeNode", argTypes, term10571, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


