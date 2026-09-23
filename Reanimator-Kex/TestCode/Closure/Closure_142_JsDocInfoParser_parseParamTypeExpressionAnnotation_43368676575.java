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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;

public class JsDocInfoParser_parseParamTypeExpressionAnnotation_43368676575 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20548;
     Object enum195;

    public JsDocInfoParser_parseParamTypeExpressionAnnotation_43368676575() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term20602 = new HashMap();
        HashMap term20611 = new HashMap();
        Set<Object> term308480 =  ((Map) term20611).keySet();
        HashSet term20610 = new HashSet((Collection<? extends Object>) term308480);
        HashMap term20618 = new HashMap();
        Set<Object> term308481 =  ((Map) term20618).keySet();
        HashSet term20617 = new HashSet((Collection<? extends Object>) term308481);
        HashMap term20625 = new HashMap();
        Set<Object> term308482 =  ((Map) term20625).keySet();
        HashSet term20624 = new HashSet((Collection<? extends Object>) term308482);
        HashMap term20631 = new HashMap();
        HashMap term20636 = new HashMap();
        Class<? extends Object> term308504 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term308503 = ((Class) term308504).getDeclaredField((String) "INHERITED");
        ((Field) term308503).setAccessible(true);
        Object enum193 = ((Field) term308503).get((Object) null);
        Class<? extends Object> term308788 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocInfoParser$State");
        Field term308787 = ((Class) term308788).getDeclaredField((String) "SEARCHING_ANNOTATION");
        ((Field) term308787).setAccessible(true);
        Object enum194 = ((Field) term308787).get((Object) null);
        HashMap term20730 = new HashMap();
        term20548 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term20549 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term20562 = (char[]) newCharArray(8);
        int[] term20572 = (int[]) newIntArray(2);
        Object term20600 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term20601 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 4);
        Object term20657 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term20671 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term20672 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term20673 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term20678 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term20679 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term20683 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term20684 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term20689 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term20702 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser$ErrorReporterParser"));
        Object term20703 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term20741 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        setField(term20549, term20549.getClass(), "string", "dAbwpJCDif");
        setCharElement(term20562, 0, 'G');
        setCharElement(term20562, 1, 'g');
        setCharElement(term20562, 2, 'n');
        setCharElement(term20562, 3, 'e');
        setCharElement(term20562, 4, 'N');
        setCharElement(term20562, 5, 'R');
        setCharElement(term20562, 6, 'd');
        setCharElement(term20562, 7, 'v');
        setField(term20549, term20549.getClass(), "stringBuffer", term20562);
        setIntField(term20549, term20549.getClass(), "stringBufferTop", 1241164745);
        setIntElement(term20572, 0, 1723148410);
        setIntElement(term20572, 1, -920797484);
        setField(term20549, term20549.getClass(), "ungetBuffer", term20572);
        setIntField(term20549, term20549.getClass(), "ungetCursor", -1631697577);
        setBooleanField(term20549, term20549.getClass(), "hitEOF", true);
        setIntField(term20549, term20549.getClass(), "lineStart", 765731371);
        setIntField(term20549, term20549.getClass(), "lineEndChar", -1703035419);
        setIntField(term20549, term20549.getClass(), "lineno", 765766290);
        setIntField(term20549, term20549.getClass(), "charno", -1284825282);
        setIntField(term20549, term20549.getClass(), "initCharno", -1941343035);
        setIntField(term20549, term20549.getClass(), "initLineno", 947897214);
        setField(term20549, term20549.getClass(), "sourceString", "ATSXJPySio");
        setIntField(term20549, term20549.getClass(), "sourceEnd", 1496340209);
        setIntField(term20549, term20549.getClass(), "sourceCursor", -1748391876);
        setIntField(term20549, term20549.getClass(), "cursor", 43258317);
        setIntField(term20549, term20549.getClass(), "tokenBeg", 1707220033);
        setIntField(term20549, term20549.getClass(), "tokenEnd", -1792504217);
        setField(term20548, term20548.getClass(), "stream", term20549);
        setField(term20600, term20600.getClass(), "reporter", null);
        setField(term20600, term20600.getClass(), "nativeTypes", term20601);
        setField(term20600, term20600.getClass(), "namesToTypes", term20602);
        setField(term20600, term20600.getClass(), "namespaces", term20610);
        setField(term20600, term20600.getClass(), "enumTypeNames", term20617);
        setField(term20600, term20600.getClass(), "forwardDeclaredTypes", term20624);
        setField(term20600, term20600.getClass(), "typesIndexedByProperty", term20631);
        setField(term20600, term20600.getClass(), "greatestSubtypeByProperty", term20636);
        setField(term20600, term20600.getClass(), "interfaceToImplementors", null);
        setField(term20600, term20600.getClass(), "unresolvedNamedTypes", null);
        setField(term20600, term20600.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term20600, term20600.getClass(), "lastGeneration", false);
        setField(term20600, term20600.getClass(), "templateTypeName", "QgHhxMyKvr");
        setField(term20657, term20657.getClass(), "name", "VGiXZZTWRO");
        setField(term20657, term20657.getClass(), "referencedType", null);
        setBooleanField(term20657, term20657.getClass(), "visited", false);
        setField(term20672, term20672.getClass(), "baseType", null);
        setField(term20672, term20672.getClass(), "implementedInterfaces", null);
        setField(term20672, term20672.getClass(), "parameters", null);
        setField(term20672, term20672.getClass(), "thrownTypes", null);
        setField(term20672, term20672.getClass(), "templateTypeName", null);
        setField(term20672, term20672.getClass(), "description", null);
        setField(term20672, term20672.getClass(), "deprecated", null);
        setField(term20672, term20672.getClass(), "license", null);
        setField(term20672, term20672.getClass(), "suppressions", null);
        setField(term20671, term20671.getClass(), "info", term20672);
        setField(term20673, term20673.getClass(), "markers", null);
        setField(term20673, term20673.getClass(), "parameters", null);
        setField(term20673, term20673.getClass(), "throwsDescriptions", null);
        setField(term20673, term20673.getClass(), "blockDescription", null);
        setField(term20673, term20673.getClass(), "fileOverview", null);
        setField(term20673, term20673.getClass(), "returnDescription", null);
        setField(term20673, term20673.getClass(), "version", null);
        setField(term20673, term20673.getClass(), "authors", null);
        setField(term20673, term20673.getClass(), "sees", null);
        setField(term20671, term20671.getClass(), "documentation", term20673);
        setField(term20671, term20671.getClass(), "sourceName", "");
        setField(term20671, term20671.getClass(), "visibility", enum193);
        setIntField(term20671, term20671.getClass(), "bitset", 1824538861);
        setField(term20678, term20678.getClass(), "root", null);
        setField(term20678, term20678.getClass(), "sourceName", null);
        setField(term20678, term20678.getClass(), "registry", null);
        setField(term20671, term20671.getClass(), "type", term20678);
        setField(term20679, term20679.getClass(), "root", null);
        setField(term20679, term20679.getClass(), "sourceName", null);
        setField(term20679, term20679.getClass(), "registry", null);
        setField(term20671, term20671.getClass(), "thisType", term20679);
        setBooleanField(term20671, term20671.getClass(), "includeDocumentation", false);
        setField(term20657, term20657.getClass(), "docInfo", term20671);
        setBooleanField(term20657, term20657.getClass(), "unknown", true);
        setBooleanField(term20657, term20657.getClass(), "resolved", false);
        setField(term20657, term20657.getClass(), "resolveResult", null);
        setField(term20657, term20657.getClass(), "registry", null);
        setField(term20600, term20600.getClass(), "templateType", term20657);
        setField(term20548, term20548.getClass(), "typeRegistry", term20600);
        setField(term20684, term20684.getClass(), "info", null);
        setField(term20684, term20684.getClass(), "documentation", null);
        setField(term20684, term20684.getClass(), "sourceName", null);
        setField(term20684, term20684.getClass(), "visibility", null);
        setIntField(term20684, term20684.getClass(), "bitset", 0);
        setField(term20684, term20684.getClass(), "type", null);
        setField(term20684, term20684.getClass(), "thisType", null);
        setBooleanField(term20684, term20684.getClass(), "includeDocumentation", false);
        setField(term20683, term20683.getClass(), "currentInfo", term20684);
        setBooleanField(term20683, term20683.getClass(), "populated", false);
        setBooleanField(term20683, term20683.getClass(), "parseDocumentation", true);
        setField(term20689, term20689.getClass(), "annotation", null);
        setField(term20689, term20689.getClass(), "name", null);
        setField(term20689, term20689.getClass(), "description", null);
        setField(term20689, term20689.getClass(), "type", null);
        setField(term20683, term20683.getClass(), "currentMarker", term20689);
        setField(term20548, term20548.getClass(), "jsdocBuilder", term20683);
        setField(term20548, term20548.getClass(), "sourceName", "mrqGHotaef");
        setField(term20548, term20548.getClass(), "errorReporter", null);
        setField(term20702, term20702.getClass(), "this$0", null);
        setField(term20548, term20548.getClass(), "parser", term20702);
        setField(term20703, term20703.getClass(), "info", null);
        setField(term20703, term20703.getClass(), "documentation", null);
        setField(term20703, term20703.getClass(), "sourceName", null);
        setField(term20703, term20703.getClass(), "visibility", null);
        setIntField(term20703, term20703.getClass(), "bitset", 0);
        setField(term20703, term20703.getClass(), "type", null);
        setField(term20703, term20703.getClass(), "thisType", null);
        setBooleanField(term20703, term20703.getClass(), "includeDocumentation", false);
        setField(term20548, term20548.getClass(), "fileOverviewJSDocInfo", term20703);
        setField(term20548, term20548.getClass(), "state", enum194);
        setField(term20548, term20548.getClass(), "annotationNames", term20730);
        setField(term20741, term20741.getClass(), "this$0", null);
        setField(term20548, term20548.getClass(), "fileLevelJsDocBuilder", term20741);
        setField(term20548, term20548.getClass(), "unreadToken", null);
        Class<? extends Object> term309145 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term309144 = ((Class) term309145).getDeclaredField((String) "RP");
        ((Field) term309144).setAccessible(true);
        enum195 = ((Field) term309144).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum195;
        try {
            callMethod(klass, "parseParamTypeExpressionAnnotation", argTypes, term20548, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


