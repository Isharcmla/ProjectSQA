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

public class JsDocInfoParser_extractSingleLineBlock_146000636069 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14670;

    public JsDocInfoParser_extractSingleLineBlock_146000636069() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term14728 = new HashMap();
        HashMap term14737 = new HashMap();
        Set<Object> term301869 =  ((Map) term14737).keySet();
        HashSet term14736 = new HashSet((Collection<? extends Object>) term301869);
        HashMap term14744 = new HashMap();
        Set<Object> term301870 =  ((Map) term14744).keySet();
        HashSet term14743 = new HashSet((Collection<? extends Object>) term301870);
        HashMap term14751 = new HashMap();
        Set<Object> term301871 =  ((Map) term14751).keySet();
        HashSet term14750 = new HashSet((Collection<? extends Object>) term301871);
        HashMap term14757 = new HashMap();
        HashMap term14762 = new HashMap();
        Class<? extends Object> term301893 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term301892 = ((Class) term301893).getDeclaredField((String) "PUBLIC");
        ((Field) term301892).setAccessible(true);
        Object enum178 = ((Field) term301892).get((Object) null);
        Class<? extends Object> term302168 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocInfoParser$State");
        Field term302167 = ((Class) term302168).getDeclaredField((String) "SEARCHING_ANNOTATION");
        ((Field) term302167).setAccessible(true);
        Object enum179 = ((Field) term302167).get((Object) null);
        HashMap term14856 = new HashMap();
        term14670 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term14671 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term14684 = (char[]) newCharArray(6);
        int[] term14692 = (int[]) newIntArray(8);
        Object term14726 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term14727 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 5);
        Object term14783 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term14797 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term14798 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term14799 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term14804 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term14805 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term14809 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term14810 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term14815 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term14828 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser$ErrorReporterParser"));
        Object term14829 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term14867 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        setField(term14671, term14671.getClass(), "string", "HknsTajwxJ");
        setCharElement(term14684, 0, 'T');
        setCharElement(term14684, 1, 'y');
        setCharElement(term14684, 2, 'S');
        setCharElement(term14684, 3, 'M');
        setCharElement(term14684, 4, 'j');
        setCharElement(term14684, 5, 'G');
        setField(term14671, term14671.getClass(), "stringBuffer", term14684);
        setIntField(term14671, term14671.getClass(), "stringBufferTop", 339372704);
        setIntElement(term14692, 0, -851097944);
        setIntElement(term14692, 1, 803925431);
        setIntElement(term14692, 2, 76929641);
        setIntElement(term14692, 3, -2003192918);
        setIntElement(term14692, 4, -1362856620);
        setIntElement(term14692, 5, -1835839814);
        setIntElement(term14692, 6, -1404350380);
        setIntElement(term14692, 7, -2013924238);
        setField(term14671, term14671.getClass(), "ungetBuffer", term14692);
        setIntField(term14671, term14671.getClass(), "ungetCursor", 579006268);
        setBooleanField(term14671, term14671.getClass(), "hitEOF", true);
        setIntField(term14671, term14671.getClass(), "lineStart", -1694747156);
        setIntField(term14671, term14671.getClass(), "lineEndChar", 1466373988);
        setIntField(term14671, term14671.getClass(), "lineno", -358526505);
        setIntField(term14671, term14671.getClass(), "charno", 1843268026);
        setIntField(term14671, term14671.getClass(), "initCharno", 954660603);
        setIntField(term14671, term14671.getClass(), "initLineno", -1351605385);
        setField(term14671, term14671.getClass(), "sourceString", "XtiurrVYKw");
        setIntField(term14671, term14671.getClass(), "sourceEnd", 278355793);
        setIntField(term14671, term14671.getClass(), "sourceCursor", -310648604);
        setIntField(term14671, term14671.getClass(), "cursor", -648200466);
        setIntField(term14671, term14671.getClass(), "tokenBeg", 2007134147);
        setIntField(term14671, term14671.getClass(), "tokenEnd", 993388358);
        setField(term14670, term14670.getClass(), "stream", term14671);
        setField(term14726, term14726.getClass(), "reporter", null);
        setField(term14726, term14726.getClass(), "nativeTypes", term14727);
        setField(term14726, term14726.getClass(), "namesToTypes", term14728);
        setField(term14726, term14726.getClass(), "namespaces", term14736);
        setField(term14726, term14726.getClass(), "enumTypeNames", term14743);
        setField(term14726, term14726.getClass(), "forwardDeclaredTypes", term14750);
        setField(term14726, term14726.getClass(), "typesIndexedByProperty", term14757);
        setField(term14726, term14726.getClass(), "greatestSubtypeByProperty", term14762);
        setField(term14726, term14726.getClass(), "interfaceToImplementors", null);
        setField(term14726, term14726.getClass(), "unresolvedNamedTypes", null);
        setField(term14726, term14726.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term14726, term14726.getClass(), "lastGeneration", false);
        setField(term14726, term14726.getClass(), "templateTypeName", "mfHtgSbdjD");
        setField(term14783, term14783.getClass(), "name", "cmuaUiHMVL");
        setField(term14783, term14783.getClass(), "referencedType", null);
        setBooleanField(term14783, term14783.getClass(), "visited", false);
        setField(term14798, term14798.getClass(), "baseType", null);
        setField(term14798, term14798.getClass(), "implementedInterfaces", null);
        setField(term14798, term14798.getClass(), "parameters", null);
        setField(term14798, term14798.getClass(), "thrownTypes", null);
        setField(term14798, term14798.getClass(), "templateTypeName", null);
        setField(term14798, term14798.getClass(), "description", null);
        setField(term14798, term14798.getClass(), "deprecated", null);
        setField(term14798, term14798.getClass(), "license", null);
        setField(term14798, term14798.getClass(), "suppressions", null);
        setField(term14797, term14797.getClass(), "info", term14798);
        setField(term14799, term14799.getClass(), "markers", null);
        setField(term14799, term14799.getClass(), "parameters", null);
        setField(term14799, term14799.getClass(), "throwsDescriptions", null);
        setField(term14799, term14799.getClass(), "blockDescription", null);
        setField(term14799, term14799.getClass(), "fileOverview", null);
        setField(term14799, term14799.getClass(), "returnDescription", null);
        setField(term14799, term14799.getClass(), "version", null);
        setField(term14799, term14799.getClass(), "authors", null);
        setField(term14799, term14799.getClass(), "sees", null);
        setField(term14797, term14797.getClass(), "documentation", term14799);
        setField(term14797, term14797.getClass(), "sourceName", "");
        setField(term14797, term14797.getClass(), "visibility", enum178);
        setIntField(term14797, term14797.getClass(), "bitset", -765191335);
        setField(term14804, term14804.getClass(), "root", null);
        setField(term14804, term14804.getClass(), "sourceName", null);
        setField(term14804, term14804.getClass(), "registry", null);
        setField(term14797, term14797.getClass(), "type", term14804);
        setField(term14805, term14805.getClass(), "root", null);
        setField(term14805, term14805.getClass(), "sourceName", null);
        setField(term14805, term14805.getClass(), "registry", null);
        setField(term14797, term14797.getClass(), "thisType", term14805);
        setBooleanField(term14797, term14797.getClass(), "includeDocumentation", false);
        setField(term14783, term14783.getClass(), "docInfo", term14797);
        setBooleanField(term14783, term14783.getClass(), "unknown", false);
        setBooleanField(term14783, term14783.getClass(), "resolved", false);
        setField(term14783, term14783.getClass(), "resolveResult", null);
        setField(term14783, term14783.getClass(), "registry", null);
        setField(term14726, term14726.getClass(), "templateType", term14783);
        setField(term14670, term14670.getClass(), "typeRegistry", term14726);
        setField(term14810, term14810.getClass(), "info", null);
        setField(term14810, term14810.getClass(), "documentation", null);
        setField(term14810, term14810.getClass(), "sourceName", null);
        setField(term14810, term14810.getClass(), "visibility", null);
        setIntField(term14810, term14810.getClass(), "bitset", 0);
        setField(term14810, term14810.getClass(), "type", null);
        setField(term14810, term14810.getClass(), "thisType", null);
        setBooleanField(term14810, term14810.getClass(), "includeDocumentation", false);
        setField(term14809, term14809.getClass(), "currentInfo", term14810);
        setBooleanField(term14809, term14809.getClass(), "populated", false);
        setBooleanField(term14809, term14809.getClass(), "parseDocumentation", false);
        setField(term14815, term14815.getClass(), "annotation", null);
        setField(term14815, term14815.getClass(), "name", null);
        setField(term14815, term14815.getClass(), "description", null);
        setField(term14815, term14815.getClass(), "type", null);
        setField(term14809, term14809.getClass(), "currentMarker", term14815);
        setField(term14670, term14670.getClass(), "jsdocBuilder", term14809);
        setField(term14670, term14670.getClass(), "sourceName", "EKpdCBubDE");
        setField(term14670, term14670.getClass(), "errorReporter", null);
        setField(term14828, term14828.getClass(), "this$0", null);
        setField(term14670, term14670.getClass(), "parser", term14828);
        setField(term14829, term14829.getClass(), "info", null);
        setField(term14829, term14829.getClass(), "documentation", null);
        setField(term14829, term14829.getClass(), "sourceName", null);
        setField(term14829, term14829.getClass(), "visibility", null);
        setIntField(term14829, term14829.getClass(), "bitset", 0);
        setField(term14829, term14829.getClass(), "type", null);
        setField(term14829, term14829.getClass(), "thisType", null);
        setBooleanField(term14829, term14829.getClass(), "includeDocumentation", false);
        setField(term14670, term14670.getClass(), "fileOverviewJSDocInfo", term14829);
        setField(term14670, term14670.getClass(), "state", enum179);
        setField(term14670, term14670.getClass(), "annotationNames", term14856);
        setField(term14867, term14867.getClass(), "this$0", null);
        setField(term14670, term14670.getClass(), "fileLevelJsDocBuilder", term14867);
        setField(term14670, term14670.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "extractSingleLineBlock", argTypes, term14670, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


