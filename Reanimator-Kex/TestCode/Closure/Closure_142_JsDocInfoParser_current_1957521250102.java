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
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.parsing.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;

public class JsDocInfoParser_current_1957521250102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49720;

    public JsDocInfoParser_current_1957521250102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term49767 = new HashMap();
        HashMap term49776 = new HashMap();
        Set<Object> term340285 =  ((Map) term49776).keySet();
        HashSet term49775 = new HashSet((Collection<? extends Object>) term340285);
        HashMap term49783 = new HashMap();
        Set<Object> term340286 =  ((Map) term49783).keySet();
        HashSet term49782 = new HashSet((Collection<? extends Object>) term340286);
        HashMap term49790 = new HashMap();
        Set<Object> term340287 =  ((Map) term49790).keySet();
        HashSet term49789 = new HashSet((Collection<? extends Object>) term340287);
        HashMap term49796 = new HashMap();
        HashMap term49801 = new HashMap();
        Class<? extends Object> term340309 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term340308 = ((Class) term340309).getDeclaredField((String) "PROTECTED");
        ((Field) term340308).setAccessible(true);
        Object enum268 = ((Field) term340308).get((Object) null);
        Class<? extends Object> term340593 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocInfoParser$State");
        Field term340592 = ((Class) term340593).getDeclaredField((String) "NEXT_IS_ANNOTATION");
        ((Field) term340592).setAccessible(true);
        Object enum269 = ((Field) term340592).get((Object) null);
        HashMap term49893 = new HashMap();
        term49720 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term49721 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term49734 = (char[]) newCharArray(0);
        int[] term49736 = (int[]) newIntArray(3);
        Object term49765 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term49766 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 4);
        Object term49822 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term49836 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term49837 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term49838 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term49843 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term49844 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term49848 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term49849 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term49854 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term49867 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser$ErrorReporterParser"));
        Object term49868 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term49904 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        setField(term49721, term49721.getClass(), "string", "eNOEXYoAtV");
        setField(term49721, term49721.getClass(), "stringBuffer", term49734);
        setIntField(term49721, term49721.getClass(), "stringBufferTop", 48047085);
        setIntElement(term49736, 0, 1902784843);
        setIntElement(term49736, 1, 2021136615);
        setIntElement(term49736, 2, 1778570695);
        setField(term49721, term49721.getClass(), "ungetBuffer", term49736);
        setIntField(term49721, term49721.getClass(), "ungetCursor", -1142164411);
        setBooleanField(term49721, term49721.getClass(), "hitEOF", true);
        setIntField(term49721, term49721.getClass(), "lineStart", -1619435313);
        setIntField(term49721, term49721.getClass(), "lineEndChar", 1013801066);
        setIntField(term49721, term49721.getClass(), "lineno", 1512541853);
        setIntField(term49721, term49721.getClass(), "charno", -965421502);
        setIntField(term49721, term49721.getClass(), "initCharno", 1319026002);
        setIntField(term49721, term49721.getClass(), "initLineno", -1368173231);
        setField(term49721, term49721.getClass(), "sourceString", "SNqwfZGLFh");
        setIntField(term49721, term49721.getClass(), "sourceEnd", 1956006038);
        setIntField(term49721, term49721.getClass(), "sourceCursor", -1062304878);
        setIntField(term49721, term49721.getClass(), "cursor", -1377876610);
        setIntField(term49721, term49721.getClass(), "tokenBeg", -1456184732);
        setIntField(term49721, term49721.getClass(), "tokenEnd", 1689228897);
        setField(term49720, term49720.getClass(), "stream", term49721);
        setField(term49765, term49765.getClass(), "reporter", null);
        setField(term49765, term49765.getClass(), "nativeTypes", term49766);
        setField(term49765, term49765.getClass(), "namesToTypes", term49767);
        setField(term49765, term49765.getClass(), "namespaces", term49775);
        setField(term49765, term49765.getClass(), "enumTypeNames", term49782);
        setField(term49765, term49765.getClass(), "forwardDeclaredTypes", term49789);
        setField(term49765, term49765.getClass(), "typesIndexedByProperty", term49796);
        setField(term49765, term49765.getClass(), "greatestSubtypeByProperty", term49801);
        setField(term49765, term49765.getClass(), "interfaceToImplementors", null);
        setField(term49765, term49765.getClass(), "unresolvedNamedTypes", null);
        setField(term49765, term49765.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term49765, term49765.getClass(), "lastGeneration", false);
        setField(term49765, term49765.getClass(), "templateTypeName", "OIFZYdbUZz");
        setField(term49822, term49822.getClass(), "name", "FPablxseTr");
        setField(term49822, term49822.getClass(), "referencedType", null);
        setBooleanField(term49822, term49822.getClass(), "visited", false);
        setField(term49837, term49837.getClass(), "baseType", null);
        setField(term49837, term49837.getClass(), "implementedInterfaces", null);
        setField(term49837, term49837.getClass(), "parameters", null);
        setField(term49837, term49837.getClass(), "thrownTypes", null);
        setField(term49837, term49837.getClass(), "templateTypeName", null);
        setField(term49837, term49837.getClass(), "description", null);
        setField(term49837, term49837.getClass(), "deprecated", null);
        setField(term49837, term49837.getClass(), "license", null);
        setField(term49837, term49837.getClass(), "suppressions", null);
        setField(term49836, term49836.getClass(), "info", term49837);
        setField(term49838, term49838.getClass(), "markers", null);
        setField(term49838, term49838.getClass(), "parameters", null);
        setField(term49838, term49838.getClass(), "throwsDescriptions", null);
        setField(term49838, term49838.getClass(), "blockDescription", null);
        setField(term49838, term49838.getClass(), "fileOverview", null);
        setField(term49838, term49838.getClass(), "returnDescription", null);
        setField(term49838, term49838.getClass(), "version", null);
        setField(term49838, term49838.getClass(), "authors", null);
        setField(term49838, term49838.getClass(), "sees", null);
        setField(term49836, term49836.getClass(), "documentation", term49838);
        setField(term49836, term49836.getClass(), "sourceName", "");
        setField(term49836, term49836.getClass(), "visibility", enum268);
        setIntField(term49836, term49836.getClass(), "bitset", 892205855);
        setField(term49843, term49843.getClass(), "root", null);
        setField(term49843, term49843.getClass(), "sourceName", null);
        setField(term49843, term49843.getClass(), "registry", null);
        setField(term49836, term49836.getClass(), "type", term49843);
        setField(term49844, term49844.getClass(), "root", null);
        setField(term49844, term49844.getClass(), "sourceName", null);
        setField(term49844, term49844.getClass(), "registry", null);
        setField(term49836, term49836.getClass(), "thisType", term49844);
        setBooleanField(term49836, term49836.getClass(), "includeDocumentation", true);
        setField(term49822, term49822.getClass(), "docInfo", term49836);
        setBooleanField(term49822, term49822.getClass(), "unknown", true);
        setBooleanField(term49822, term49822.getClass(), "resolved", true);
        setField(term49822, term49822.getClass(), "resolveResult", null);
        setField(term49822, term49822.getClass(), "registry", null);
        setField(term49765, term49765.getClass(), "templateType", term49822);
        setField(term49720, term49720.getClass(), "typeRegistry", term49765);
        setField(term49849, term49849.getClass(), "info", null);
        setField(term49849, term49849.getClass(), "documentation", null);
        setField(term49849, term49849.getClass(), "sourceName", null);
        setField(term49849, term49849.getClass(), "visibility", null);
        setIntField(term49849, term49849.getClass(), "bitset", 0);
        setField(term49849, term49849.getClass(), "type", null);
        setField(term49849, term49849.getClass(), "thisType", null);
        setBooleanField(term49849, term49849.getClass(), "includeDocumentation", false);
        setField(term49848, term49848.getClass(), "currentInfo", term49849);
        setBooleanField(term49848, term49848.getClass(), "populated", false);
        setBooleanField(term49848, term49848.getClass(), "parseDocumentation", true);
        setField(term49854, term49854.getClass(), "annotation", null);
        setField(term49854, term49854.getClass(), "name", null);
        setField(term49854, term49854.getClass(), "description", null);
        setField(term49854, term49854.getClass(), "type", null);
        setField(term49848, term49848.getClass(), "currentMarker", term49854);
        setField(term49720, term49720.getClass(), "jsdocBuilder", term49848);
        setField(term49720, term49720.getClass(), "sourceName", "mKgLwPdYbY");
        setField(term49720, term49720.getClass(), "errorReporter", null);
        setField(term49867, term49867.getClass(), "this$0", null);
        setField(term49720, term49720.getClass(), "parser", term49867);
        setField(term49868, term49868.getClass(), "info", null);
        setField(term49868, term49868.getClass(), "documentation", null);
        setField(term49868, term49868.getClass(), "sourceName", null);
        setField(term49868, term49868.getClass(), "visibility", null);
        setIntField(term49868, term49868.getClass(), "bitset", 0);
        setField(term49868, term49868.getClass(), "type", null);
        setField(term49868, term49868.getClass(), "thisType", null);
        setBooleanField(term49868, term49868.getClass(), "includeDocumentation", false);
        setField(term49720, term49720.getClass(), "fileOverviewJSDocInfo", term49868);
        setField(term49720, term49720.getClass(), "state", enum269);
        setField(term49720, term49720.getClass(), "annotationNames", term49893);
        setField(term49904, term49904.getClass(), "this$0", null);
        setField(term49720, term49720.getClass(), "fileLevelJsDocBuilder", term49904);
        setField(term49720, term49720.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "current", argTypes, term49720, args);
    }

};


