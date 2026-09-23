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
import java.lang.Integer;

public class IRFactory_newNode_156626018847 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10881;
     Object term10995;
     Object term10997;

    public IRFactory_newNode_156626018847() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term10909 = new HashMap();
        HashMap term10918 = new HashMap();
        Set<Object> term38143 =  ((Map) term10918).keySet();
        HashSet term10917 = new HashSet((Collection<? extends Object>) term38143);
        Class<? extends Object> term38145 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term38144 = ((Class) term38145).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term38144).setAccessible(true);
        Object enum75 = ((Field) term38144).get((Object) null);
        HashMap term10942 = new HashMap();
        Set<Object> term38464 =  ((Map) term10942).keySet();
        HashSet term10941 = new HashSet((Collection<? extends Object>) term38464);
        HashMap term10961 = new HashMap();
        Set<Object> term38465 =  ((Map) term10961).keySet();
        HashSet term10960 = new HashSet((Collection<? extends Object>) term38465);
        HashMap term10967 = new HashMap();
        Set<Object> term38466 =  ((Map) term10967).keySet();
        HashSet term10966 = new HashSet((Collection<? extends Object>) term38466);
        term10881 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term10906 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term10940 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term10985 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10988 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        Object term10989 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term10992 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term10881, term10881.getClass(), "sourceString", "GPSEWEDSTo");
        setField(term10881, term10881.getClass(), "sourceFile", null);
        setField(term10881, term10881.getClass(), "sourceName", "RCOqfVsRHt");
        setBooleanField(term10906, term10906.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term10906, term10906.getClass(), "isIdeMode", false);
        setField(term10906, term10906.getClass(), "annotationNames", term10909);
        setField(term10906, term10906.getClass(), "suppressionNames", term10917);
        setField(term10906, term10906.getClass(), "languageMode", enum75);
        setBooleanField(term10906, term10906.getClass(), "acceptConstKeyword", true);
        setField(term10881, term10881.getClass(), "config", term10906);
        setField(term10881, term10881.getClass(), "errorReporter", null);
        setField(term10940, term10940.getClass(), "this$0", null);
        setField(term10881, term10881.getClass(), "transformDispatcher", term10940);
        setField(term10881, term10881.getClass(), "ALLOWED_DIRECTIVES", term10941);
        setField(term10881, term10881.getClass(), "reservedKeywords", term10960);
        setField(term10881, term10881.getClass(), "parsedComments", term10966);
        setIntField(term10985, term10985.getClass(), "type", 0);
        setField(term10985, term10985.getClass(), "next", null);
        setField(term10985, term10985.getClass(), "first", null);
        setField(term10985, term10985.getClass(), "last", null);
        setField(term10985, term10985.getClass(), "propListHead", null);
        setIntField(term10985, term10985.getClass(), "sourcePosition", 0);
        setField(term10985, term10985.getClass(), "jsType", null);
        setField(term10985, term10985.getClass(), "parent", null);
        setField(term10881, term10881.getClass(), "rootNodeJsDocHolder", term10985);
        setField(term10988, term10988.getClass(), "this$0", null);
        setField(term10881, term10881.getClass(), "fileLevelJsDocBuilder", term10988);
        setField(term10989, term10989.getClass(), "info", null);
        setField(term10989, term10989.getClass(), "documentation", null);
        setField(term10989, term10989.getClass(), "associatedNode", null);
        setField(term10989, term10989.getClass(), "visibility", null);
        setIntField(term10989, term10989.getClass(), "bitset", 0);
        setField(term10989, term10989.getClass(), "type", null);
        setField(term10989, term10989.getClass(), "thisType", null);
        setBooleanField(term10989, term10989.getClass(), "includeDocumentation", false);
        setField(term10881, term10881.getClass(), "fileOverviewInfo", term10989);
        setIntField(term10992, term10992.getClass(), "type", 0);
        setField(term10992, term10992.getClass(), "next", null);
        setField(term10992, term10992.getClass(), "first", null);
        setField(term10992, term10992.getClass(), "last", null);
        setField(term10992, term10992.getClass(), "propListHead", null);
        setIntField(term10992, term10992.getClass(), "sourcePosition", 0);
        setField(term10992, term10992.getClass(), "jsType", null);
        setField(term10992, term10992.getClass(), "parent", null);
        setField(term10881, term10881.getClass(), "templateNode", term10992);
        term10995 = new Integer(-868676396);
        term10997 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10999 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11001 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11003 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11005 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11008 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11012 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11014 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11019 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10997, term10997.getClass(), "type", 1922684808);
        setIntField(term10999, term10999.getClass(), "type", -2005784375);
        setIntField(term11001, term11001.getClass(), "type", -288604325);
        setIntField(term11003, term11003.getClass(), "type", -1268314569);
        setIntField(term11005, term11005.getClass(), "type", 877649659);
        setField(term11005, term11005.getClass(), "next", null);
        setField(term11005, term11005.getClass(), "first", null);
        setField(term11005, term11005.getClass(), "last", null);
        setField(term11005, term11005.getClass(), "propListHead", null);
        setIntField(term11005, term11005.getClass(), "sourcePosition", 0);
        setField(term11005, term11005.getClass(), "jsType", null);
        setField(term11005, term11005.getClass(), "parent", null);
        setField(term11003, term11003.getClass(), "next", term11005);
        setIntField(term11008, term11008.getClass(), "type", -1332748804);
        setField(term11008, term11008.getClass(), "next", null);
        setField(term11008, term11008.getClass(), "first", null);
        setField(term11008, term11008.getClass(), "last", term11005);
        setField(term11008, term11008.getClass(), "propListHead", null);
        setIntField(term11008, term11008.getClass(), "sourcePosition", 0);
        setField(term11008, term11008.getClass(), "jsType", null);
        setField(term11008, term11008.getClass(), "parent", null);
        setField(term11003, term11003.getClass(), "first", term11008);
        setField(term11003, term11003.getClass(), "last", term11001);
        setField(term11003, term11003.getClass(), "propListHead", null);
        setIntField(term11003, term11003.getClass(), "sourcePosition", 0);
        setField(term11003, term11003.getClass(), "jsType", null);
        setField(term11003, term11003.getClass(), "parent", null);
        setField(term11001, term11001.getClass(), "next", term11003);
        setField(term11001, term11001.getClass(), "first", term11005);
        setIntField(term11012, term11012.getClass(), "type", -1420269858);
        setIntField(term11014, term11014.getClass(), "type", -2119545015);
        setField(term11014, term11014.getClass(), "next", null);
        setField(term11014, term11014.getClass(), "first", term11008);
        setField(term11014, term11014.getClass(), "last", term11003);
        setField(term11014, term11014.getClass(), "propListHead", null);
        setIntField(term11014, term11014.getClass(), "sourcePosition", 0);
        setField(term11014, term11014.getClass(), "jsType", null);
        setField(term11014, term11014.getClass(), "parent", null);
        setField(term11012, term11012.getClass(), "next", term11014);
        setField(term11012, term11012.getClass(), "first", term10999);
        setField(term11012, term11012.getClass(), "last", term10999);
        setField(term11012, term11012.getClass(), "propListHead", null);
        setIntField(term11012, term11012.getClass(), "sourcePosition", 0);
        setField(term11012, term11012.getClass(), "jsType", null);
        setField(term11012, term11012.getClass(), "parent", null);
        setField(term11001, term11001.getClass(), "last", term11012);
        setField(term11001, term11001.getClass(), "propListHead", null);
        setIntField(term11001, term11001.getClass(), "sourcePosition", 0);
        setField(term11001, term11001.getClass(), "jsType", null);
        setField(term11001, term11001.getClass(), "parent", null);
        setField(term10999, term10999.getClass(), "next", term11001);
        setIntField(term11019, term11019.getClass(), "type", 1272542218);
        setField(term11019, term11019.getClass(), "next", term11012);
        setField(term11019, term11019.getClass(), "first", term11014);
        setField(term11019, term11019.getClass(), "last", term10997);
        setField(term11019, term11019.getClass(), "propListHead", null);
        setIntField(term11019, term11019.getClass(), "sourcePosition", 0);
        setField(term11019, term11019.getClass(), "jsType", null);
        setField(term11019, term11019.getClass(), "parent", null);
        setField(term10999, term10999.getClass(), "first", term11019);
        setField(term10999, term10999.getClass(), "last", term11019);
        setField(term10999, term10999.getClass(), "propListHead", null);
        setIntField(term10999, term10999.getClass(), "sourcePosition", 0);
        setField(term10999, term10999.getClass(), "jsType", null);
        setField(term10999, term10999.getClass(), "parent", null);
        setField(term10997, term10997.getClass(), "next", term10999);
        setField(term10997, term10997.getClass(), "first", term11003);
        setField(term10997, term10997.getClass(), "last", term11005);
        setField(term10997, term10997.getClass(), "propListHead", null);
        setIntField(term10997, term10997.getClass(), "sourcePosition", 0);
        setField(term10997, term10997.getClass(), "jsType", null);
        setField(term10997, term10997.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term10995;
        args[1] = term10997;
        try {
            callMethod(klass, "newNode", argTypes, term10881, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


