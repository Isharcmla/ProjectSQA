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

public class JsDocInfoParser_reportTypeSyntaxWarning_60867046295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42553;

    public JsDocInfoParser_reportTypeSyntaxWarning_60867046295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term42600 = new HashMap();
        HashMap term42609 = new HashMap();
        Set<Object> term334276 =  ((Map) term42609).keySet();
        HashSet term42608 = new HashSet((Collection<? extends Object>) term334276);
        HashMap term42616 = new HashMap();
        Set<Object> term334277 =  ((Map) term42616).keySet();
        HashSet term42615 = new HashSet((Collection<? extends Object>) term334277);
        HashMap term42623 = new HashMap();
        Set<Object> term334278 =  ((Map) term42623).keySet();
        HashSet term42622 = new HashSet((Collection<? extends Object>) term334278);
        HashMap term42628 = new HashMap();
        HashMap term42633 = new HashMap();
        Class<? extends Object> term334300 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term334299 = ((Class) term334300).getDeclaredField((String) "PUBLIC");
        ((Field) term334299).setAccessible(true);
        Object enum250 = ((Field) term334299).get((Object) null);
        Class<? extends Object> term334575 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocInfoParser$State");
        Field term334574 = ((Class) term334575).getDeclaredField((String) "SEARCHING_ANNOTATION");
        ((Field) term334574).setAccessible(true);
        Object enum251 = ((Field) term334574).get((Object) null);
        HashMap term42726 = new HashMap();
        term42553 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term42554 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term42567 = (char[]) newCharArray(3);
        int[] term42572 = (int[]) newIntArray(0);
        Object term42598 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term42599 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 3);
        Object term42654 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term42668 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term42669 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term42670 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term42675 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term42679 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term42680 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term42685 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term42698 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser$ErrorReporterParser"));
        Object term42699 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term42737 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        setField(term42554, term42554.getClass(), "string", "JJUWbMXpyM");
        setCharElement(term42567, 0, 'I');
        setCharElement(term42567, 1, 'f');
        setCharElement(term42567, 2, 'E');
        setField(term42554, term42554.getClass(), "stringBuffer", term42567);
        setIntField(term42554, term42554.getClass(), "stringBufferTop", -802592348);
        setField(term42554, term42554.getClass(), "ungetBuffer", term42572);
        setIntField(term42554, term42554.getClass(), "ungetCursor", -1576584269);
        setBooleanField(term42554, term42554.getClass(), "hitEOF", false);
        setIntField(term42554, term42554.getClass(), "lineStart", 1474899591);
        setIntField(term42554, term42554.getClass(), "lineEndChar", 297582552);
        setIntField(term42554, term42554.getClass(), "lineno", -1485916498);
        setIntField(term42554, term42554.getClass(), "charno", 722787672);
        setIntField(term42554, term42554.getClass(), "initCharno", 2077491675);
        setIntField(term42554, term42554.getClass(), "initLineno", -1728316609);
        setField(term42554, term42554.getClass(), "sourceString", "KDrRQWVXok");
        setIntField(term42554, term42554.getClass(), "sourceEnd", 47118909);
        setIntField(term42554, term42554.getClass(), "sourceCursor", -2093707412);
        setIntField(term42554, term42554.getClass(), "cursor", -680627153);
        setIntField(term42554, term42554.getClass(), "tokenBeg", 722519669);
        setIntField(term42554, term42554.getClass(), "tokenEnd", -40335961);
        setField(term42553, term42553.getClass(), "stream", term42554);
        setField(term42598, term42598.getClass(), "reporter", null);
        setField(term42598, term42598.getClass(), "nativeTypes", term42599);
        setField(term42598, term42598.getClass(), "namesToTypes", term42600);
        setField(term42598, term42598.getClass(), "namespaces", term42608);
        setField(term42598, term42598.getClass(), "enumTypeNames", term42615);
        setField(term42598, term42598.getClass(), "forwardDeclaredTypes", term42622);
        setField(term42598, term42598.getClass(), "typesIndexedByProperty", term42628);
        setField(term42598, term42598.getClass(), "greatestSubtypeByProperty", term42633);
        setField(term42598, term42598.getClass(), "interfaceToImplementors", null);
        setField(term42598, term42598.getClass(), "unresolvedNamedTypes", null);
        setField(term42598, term42598.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term42598, term42598.getClass(), "lastGeneration", false);
        setField(term42598, term42598.getClass(), "templateTypeName", "VoKhXiLAaW");
        setField(term42654, term42654.getClass(), "name", "CaalXzRXQI");
        setField(term42654, term42654.getClass(), "referencedType", null);
        setBooleanField(term42654, term42654.getClass(), "visited", true);
        setField(term42669, term42669.getClass(), "baseType", null);
        setField(term42669, term42669.getClass(), "implementedInterfaces", null);
        setField(term42669, term42669.getClass(), "parameters", null);
        setField(term42669, term42669.getClass(), "thrownTypes", null);
        setField(term42669, term42669.getClass(), "templateTypeName", null);
        setField(term42669, term42669.getClass(), "description", null);
        setField(term42669, term42669.getClass(), "deprecated", null);
        setField(term42669, term42669.getClass(), "license", null);
        setField(term42669, term42669.getClass(), "suppressions", null);
        setField(term42668, term42668.getClass(), "info", term42669);
        setField(term42670, term42670.getClass(), "markers", null);
        setField(term42670, term42670.getClass(), "parameters", null);
        setField(term42670, term42670.getClass(), "throwsDescriptions", null);
        setField(term42670, term42670.getClass(), "blockDescription", null);
        setField(term42670, term42670.getClass(), "fileOverview", null);
        setField(term42670, term42670.getClass(), "returnDescription", null);
        setField(term42670, term42670.getClass(), "version", null);
        setField(term42670, term42670.getClass(), "authors", null);
        setField(term42670, term42670.getClass(), "sees", null);
        setField(term42668, term42668.getClass(), "documentation", term42670);
        setField(term42668, term42668.getClass(), "sourceName", "");
        setField(term42668, term42668.getClass(), "visibility", enum250);
        setIntField(term42668, term42668.getClass(), "bitset", 175343605);
        setField(term42675, term42675.getClass(), "root", null);
        setField(term42675, term42675.getClass(), "sourceName", null);
        setField(term42675, term42675.getClass(), "registry", null);
        setField(term42668, term42668.getClass(), "type", term42675);
        setField(term42668, term42668.getClass(), "thisType", term42675);
        setBooleanField(term42668, term42668.getClass(), "includeDocumentation", false);
        setField(term42654, term42654.getClass(), "docInfo", term42668);
        setBooleanField(term42654, term42654.getClass(), "unknown", true);
        setBooleanField(term42654, term42654.getClass(), "resolved", true);
        setField(term42654, term42654.getClass(), "resolveResult", null);
        setField(term42654, term42654.getClass(), "registry", null);
        setField(term42598, term42598.getClass(), "templateType", term42654);
        setField(term42553, term42553.getClass(), "typeRegistry", term42598);
        setField(term42680, term42680.getClass(), "info", null);
        setField(term42680, term42680.getClass(), "documentation", null);
        setField(term42680, term42680.getClass(), "sourceName", null);
        setField(term42680, term42680.getClass(), "visibility", null);
        setIntField(term42680, term42680.getClass(), "bitset", 0);
        setField(term42680, term42680.getClass(), "type", null);
        setField(term42680, term42680.getClass(), "thisType", null);
        setBooleanField(term42680, term42680.getClass(), "includeDocumentation", false);
        setField(term42679, term42679.getClass(), "currentInfo", term42680);
        setBooleanField(term42679, term42679.getClass(), "populated", false);
        setBooleanField(term42679, term42679.getClass(), "parseDocumentation", false);
        setField(term42685, term42685.getClass(), "annotation", null);
        setField(term42685, term42685.getClass(), "name", null);
        setField(term42685, term42685.getClass(), "description", null);
        setField(term42685, term42685.getClass(), "type", null);
        setField(term42679, term42679.getClass(), "currentMarker", term42685);
        setField(term42553, term42553.getClass(), "jsdocBuilder", term42679);
        setField(term42553, term42553.getClass(), "sourceName", "cTCixEbHYT");
        setField(term42553, term42553.getClass(), "errorReporter", null);
        setField(term42698, term42698.getClass(), "this$0", null);
        setField(term42553, term42553.getClass(), "parser", term42698);
        setField(term42699, term42699.getClass(), "info", null);
        setField(term42699, term42699.getClass(), "documentation", null);
        setField(term42699, term42699.getClass(), "sourceName", null);
        setField(term42699, term42699.getClass(), "visibility", null);
        setIntField(term42699, term42699.getClass(), "bitset", 0);
        setField(term42699, term42699.getClass(), "type", null);
        setField(term42699, term42699.getClass(), "thisType", null);
        setBooleanField(term42699, term42699.getClass(), "includeDocumentation", false);
        setField(term42553, term42553.getClass(), "fileOverviewJSDocInfo", term42699);
        setField(term42553, term42553.getClass(), "state", enum251);
        setField(term42553, term42553.getClass(), "annotationNames", term42726);
        setField(term42737, term42737.getClass(), "this$0", null);
        setField(term42553, term42553.getClass(), "fileLevelJsDocBuilder", term42737);
        setField(term42553, term42553.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jAIAdEmULK";
        try {
            callMethod(klass, "reportTypeSyntaxWarning", argTypes, term42553, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


