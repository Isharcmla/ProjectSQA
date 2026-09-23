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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;

public class JsDocInfoParser_skipEOLs_1463094301103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50580;

    public JsDocInfoParser_skipEOLs_1463094301103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term50633 = new HashMap();
        HashMap term50642 = new HashMap();
        Set<Object> term340979 =  ((Map) term50642).keySet();
        HashSet term50641 = new HashSet((Collection<? extends Object>) term340979);
        HashMap term50649 = new HashMap();
        Set<Object> term340980 =  ((Map) term50649).keySet();
        HashSet term50648 = new HashSet((Collection<? extends Object>) term340980);
        HashMap term50656 = new HashMap();
        Set<Object> term340981 =  ((Map) term50656).keySet();
        HashSet term50655 = new HashSet((Collection<? extends Object>) term340981);
        HashMap term50662 = new HashMap();
        HashMap term50667 = new HashMap();
        Class<? extends Object> term341003 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term341002 = ((Class) term341003).getDeclaredField((String) "PROTECTED");
        ((Field) term341002).setAccessible(true);
        Object enum270 = ((Field) term341002).get((Object) null);
        Class<? extends Object> term341287 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocInfoParser$State");
        Field term341286 = ((Class) term341287).getDeclaredField((String) "SEARCHING_NEWLINE");
        ((Field) term341286).setAccessible(true);
        Object enum271 = ((Field) term341286).get((Object) null);
        HashMap term50758 = new HashMap();
        term50580 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term50581 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term50594 = (char[]) newCharArray(5);
        int[] term50601 = (int[]) newIntArray(4);
        Object term50631 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term50632 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 4);
        Object term50688 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term50702 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term50703 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term50704 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term50709 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term50710 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term50714 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term50715 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term50720 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term50733 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser$ErrorReporterParser"));
        Object term50734 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term50769 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        setField(term50581, term50581.getClass(), "string", "KoPzTuvIeK");
        setCharElement(term50594, 0, 'h');
        setCharElement(term50594, 1, 'N');
        setCharElement(term50594, 2, 'x');
        setCharElement(term50594, 3, 'W');
        setCharElement(term50594, 4, 'a');
        setField(term50581, term50581.getClass(), "stringBuffer", term50594);
        setIntField(term50581, term50581.getClass(), "stringBufferTop", -1330529019);
        setIntElement(term50601, 0, 237134844);
        setIntElement(term50601, 1, 2076413861);
        setIntElement(term50601, 2, 66817373);
        setIntElement(term50601, 3, 1459628013);
        setField(term50581, term50581.getClass(), "ungetBuffer", term50601);
        setIntField(term50581, term50581.getClass(), "ungetCursor", -1641507499);
        setBooleanField(term50581, term50581.getClass(), "hitEOF", true);
        setIntField(term50581, term50581.getClass(), "lineStart", -33436796);
        setIntField(term50581, term50581.getClass(), "lineEndChar", -1527326823);
        setIntField(term50581, term50581.getClass(), "lineno", 469871899);
        setIntField(term50581, term50581.getClass(), "charno", -1348703436);
        setIntField(term50581, term50581.getClass(), "initCharno", -2027012650);
        setIntField(term50581, term50581.getClass(), "initLineno", 1343432022);
        setField(term50581, term50581.getClass(), "sourceString", "SMoWUILIhn");
        setIntField(term50581, term50581.getClass(), "sourceEnd", -1767079160);
        setIntField(term50581, term50581.getClass(), "sourceCursor", -201010601);
        setIntField(term50581, term50581.getClass(), "cursor", 2060027076);
        setIntField(term50581, term50581.getClass(), "tokenBeg", 2084868811);
        setIntField(term50581, term50581.getClass(), "tokenEnd", 314478878);
        setField(term50580, term50580.getClass(), "stream", term50581);
        setField(term50631, term50631.getClass(), "reporter", null);
        setField(term50631, term50631.getClass(), "nativeTypes", term50632);
        setField(term50631, term50631.getClass(), "namesToTypes", term50633);
        setField(term50631, term50631.getClass(), "namespaces", term50641);
        setField(term50631, term50631.getClass(), "enumTypeNames", term50648);
        setField(term50631, term50631.getClass(), "forwardDeclaredTypes", term50655);
        setField(term50631, term50631.getClass(), "typesIndexedByProperty", term50662);
        setField(term50631, term50631.getClass(), "greatestSubtypeByProperty", term50667);
        setField(term50631, term50631.getClass(), "interfaceToImplementors", null);
        setField(term50631, term50631.getClass(), "unresolvedNamedTypes", null);
        setField(term50631, term50631.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term50631, term50631.getClass(), "lastGeneration", true);
        setField(term50631, term50631.getClass(), "templateTypeName", "fzzIOVxKdF");
        setField(term50688, term50688.getClass(), "name", "cdvmxZaBEK");
        setField(term50688, term50688.getClass(), "referencedType", null);
        setBooleanField(term50688, term50688.getClass(), "visited", false);
        setField(term50703, term50703.getClass(), "baseType", null);
        setField(term50703, term50703.getClass(), "implementedInterfaces", null);
        setField(term50703, term50703.getClass(), "parameters", null);
        setField(term50703, term50703.getClass(), "thrownTypes", null);
        setField(term50703, term50703.getClass(), "templateTypeName", null);
        setField(term50703, term50703.getClass(), "description", null);
        setField(term50703, term50703.getClass(), "deprecated", null);
        setField(term50703, term50703.getClass(), "license", null);
        setField(term50703, term50703.getClass(), "suppressions", null);
        setField(term50702, term50702.getClass(), "info", term50703);
        setField(term50704, term50704.getClass(), "markers", null);
        setField(term50704, term50704.getClass(), "parameters", null);
        setField(term50704, term50704.getClass(), "throwsDescriptions", null);
        setField(term50704, term50704.getClass(), "blockDescription", null);
        setField(term50704, term50704.getClass(), "fileOverview", null);
        setField(term50704, term50704.getClass(), "returnDescription", null);
        setField(term50704, term50704.getClass(), "version", null);
        setField(term50704, term50704.getClass(), "authors", null);
        setField(term50704, term50704.getClass(), "sees", null);
        setField(term50702, term50702.getClass(), "documentation", term50704);
        setField(term50702, term50702.getClass(), "sourceName", "");
        setField(term50702, term50702.getClass(), "visibility", enum270);
        setIntField(term50702, term50702.getClass(), "bitset", 1425342686);
        setField(term50709, term50709.getClass(), "root", null);
        setField(term50709, term50709.getClass(), "sourceName", null);
        setField(term50709, term50709.getClass(), "registry", null);
        setField(term50702, term50702.getClass(), "type", term50709);
        setField(term50710, term50710.getClass(), "root", null);
        setField(term50710, term50710.getClass(), "sourceName", null);
        setField(term50710, term50710.getClass(), "registry", null);
        setField(term50702, term50702.getClass(), "thisType", term50710);
        setBooleanField(term50702, term50702.getClass(), "includeDocumentation", false);
        setField(term50688, term50688.getClass(), "docInfo", term50702);
        setBooleanField(term50688, term50688.getClass(), "unknown", true);
        setBooleanField(term50688, term50688.getClass(), "resolved", false);
        setField(term50688, term50688.getClass(), "resolveResult", null);
        setField(term50688, term50688.getClass(), "registry", null);
        setField(term50631, term50631.getClass(), "templateType", term50688);
        setField(term50580, term50580.getClass(), "typeRegistry", term50631);
        setField(term50715, term50715.getClass(), "info", null);
        setField(term50715, term50715.getClass(), "documentation", null);
        setField(term50715, term50715.getClass(), "sourceName", null);
        setField(term50715, term50715.getClass(), "visibility", null);
        setIntField(term50715, term50715.getClass(), "bitset", 0);
        setField(term50715, term50715.getClass(), "type", null);
        setField(term50715, term50715.getClass(), "thisType", null);
        setBooleanField(term50715, term50715.getClass(), "includeDocumentation", false);
        setField(term50714, term50714.getClass(), "currentInfo", term50715);
        setBooleanField(term50714, term50714.getClass(), "populated", false);
        setBooleanField(term50714, term50714.getClass(), "parseDocumentation", false);
        setField(term50720, term50720.getClass(), "annotation", null);
        setField(term50720, term50720.getClass(), "name", null);
        setField(term50720, term50720.getClass(), "description", null);
        setField(term50720, term50720.getClass(), "type", null);
        setField(term50714, term50714.getClass(), "currentMarker", term50720);
        setField(term50580, term50580.getClass(), "jsdocBuilder", term50714);
        setField(term50580, term50580.getClass(), "sourceName", "uCdLbhvYeG");
        setField(term50580, term50580.getClass(), "errorReporter", null);
        setField(term50733, term50733.getClass(), "this$0", null);
        setField(term50580, term50580.getClass(), "parser", term50733);
        setField(term50734, term50734.getClass(), "info", null);
        setField(term50734, term50734.getClass(), "documentation", null);
        setField(term50734, term50734.getClass(), "sourceName", null);
        setField(term50734, term50734.getClass(), "visibility", null);
        setIntField(term50734, term50734.getClass(), "bitset", 0);
        setField(term50734, term50734.getClass(), "type", null);
        setField(term50734, term50734.getClass(), "thisType", null);
        setBooleanField(term50734, term50734.getClass(), "includeDocumentation", false);
        setField(term50580, term50580.getClass(), "fileOverviewJSDocInfo", term50734);
        setField(term50580, term50580.getClass(), "state", enum271);
        setField(term50580, term50580.getClass(), "annotationNames", term50758);
        setField(term50769, term50769.getClass(), "this$0", null);
        setField(term50580, term50580.getClass(), "fileLevelJsDocBuilder", term50769);
        setField(term50580, term50580.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "skipEOLs", argTypes, term50580, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


