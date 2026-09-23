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
     Object term10875;
     Object term10989;
     Object term10991;

    public IRFactory_newNode_156626018847() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term10903 = new HashMap();
        HashMap term10912 = new HashMap();
        Set<Object> term38121 =  ((Map) term10912).keySet();
        HashSet term10911 = new HashSet((Collection<? extends Object>) term38121);
        Class<? extends Object> term38123 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term38122 = ((Class) term38123).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term38122).setAccessible(true);
        Object enum75 = ((Field) term38122).get((Object) null);
        HashMap term10936 = new HashMap();
        Set<Object> term38442 =  ((Map) term10936).keySet();
        HashSet term10935 = new HashSet((Collection<? extends Object>) term38442);
        HashMap term10955 = new HashMap();
        Set<Object> term38443 =  ((Map) term10955).keySet();
        HashSet term10954 = new HashSet((Collection<? extends Object>) term38443);
        HashMap term10961 = new HashMap();
        Set<Object> term38444 =  ((Map) term10961).keySet();
        HashSet term10960 = new HashSet((Collection<? extends Object>) term38444);
        term10875 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term10900 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term10934 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term10979 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10982 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        Object term10983 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term10986 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term10875, term10875.getClass(), "sourceString", "GPSEWEDSTo");
        setField(term10875, term10875.getClass(), "sourceFile", null);
        setField(term10875, term10875.getClass(), "sourceName", "RCOqfVsRHt");
        setBooleanField(term10900, term10900.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term10900, term10900.getClass(), "isIdeMode", false);
        setField(term10900, term10900.getClass(), "annotationNames", term10903);
        setField(term10900, term10900.getClass(), "suppressionNames", term10911);
        setField(term10900, term10900.getClass(), "languageMode", enum75);
        setBooleanField(term10900, term10900.getClass(), "acceptConstKeyword", true);
        setField(term10875, term10875.getClass(), "config", term10900);
        setField(term10875, term10875.getClass(), "errorReporter", null);
        setField(term10934, term10934.getClass(), "this$0", null);
        setField(term10875, term10875.getClass(), "transformDispatcher", term10934);
        setField(term10875, term10875.getClass(), "ALLOWED_DIRECTIVES", term10935);
        setField(term10875, term10875.getClass(), "reservedKeywords", term10954);
        setField(term10875, term10875.getClass(), "parsedComments", term10960);
        setIntField(term10979, term10979.getClass(), "type", 0);
        setField(term10979, term10979.getClass(), "next", null);
        setField(term10979, term10979.getClass(), "first", null);
        setField(term10979, term10979.getClass(), "last", null);
        setField(term10979, term10979.getClass(), "propListHead", null);
        setIntField(term10979, term10979.getClass(), "sourcePosition", 0);
        setField(term10979, term10979.getClass(), "jsType", null);
        setField(term10979, term10979.getClass(), "parent", null);
        setField(term10875, term10875.getClass(), "rootNodeJsDocHolder", term10979);
        setField(term10982, term10982.getClass(), "this$0", null);
        setField(term10875, term10875.getClass(), "fileLevelJsDocBuilder", term10982);
        setField(term10983, term10983.getClass(), "info", null);
        setField(term10983, term10983.getClass(), "documentation", null);
        setField(term10983, term10983.getClass(), "associatedNode", null);
        setField(term10983, term10983.getClass(), "visibility", null);
        setIntField(term10983, term10983.getClass(), "bitset", 0);
        setField(term10983, term10983.getClass(), "type", null);
        setField(term10983, term10983.getClass(), "thisType", null);
        setBooleanField(term10983, term10983.getClass(), "includeDocumentation", false);
        setField(term10875, term10875.getClass(), "fileOverviewInfo", term10983);
        setIntField(term10986, term10986.getClass(), "type", 0);
        setField(term10986, term10986.getClass(), "next", null);
        setField(term10986, term10986.getClass(), "first", null);
        setField(term10986, term10986.getClass(), "last", null);
        setField(term10986, term10986.getClass(), "propListHead", null);
        setIntField(term10986, term10986.getClass(), "sourcePosition", 0);
        setField(term10986, term10986.getClass(), "jsType", null);
        setField(term10986, term10986.getClass(), "parent", null);
        setField(term10875, term10875.getClass(), "templateNode", term10986);
        term10989 = new Integer(-868676396);
        term10991 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10993 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10995 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10997 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10999 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11002 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11006 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11008 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11013 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10991, term10991.getClass(), "type", 1922684808);
        setIntField(term10993, term10993.getClass(), "type", -2005784375);
        setIntField(term10995, term10995.getClass(), "type", -288604325);
        setIntField(term10997, term10997.getClass(), "type", -1268314569);
        setIntField(term10999, term10999.getClass(), "type", 877649659);
        setField(term10999, term10999.getClass(), "next", null);
        setField(term10999, term10999.getClass(), "first", null);
        setField(term10999, term10999.getClass(), "last", null);
        setField(term10999, term10999.getClass(), "propListHead", null);
        setIntField(term10999, term10999.getClass(), "sourcePosition", 0);
        setField(term10999, term10999.getClass(), "jsType", null);
        setField(term10999, term10999.getClass(), "parent", null);
        setField(term10997, term10997.getClass(), "next", term10999);
        setIntField(term11002, term11002.getClass(), "type", -1332748804);
        setField(term11002, term11002.getClass(), "next", null);
        setField(term11002, term11002.getClass(), "first", null);
        setField(term11002, term11002.getClass(), "last", term10999);
        setField(term11002, term11002.getClass(), "propListHead", null);
        setIntField(term11002, term11002.getClass(), "sourcePosition", 0);
        setField(term11002, term11002.getClass(), "jsType", null);
        setField(term11002, term11002.getClass(), "parent", null);
        setField(term10997, term10997.getClass(), "first", term11002);
        setField(term10997, term10997.getClass(), "last", term10995);
        setField(term10997, term10997.getClass(), "propListHead", null);
        setIntField(term10997, term10997.getClass(), "sourcePosition", 0);
        setField(term10997, term10997.getClass(), "jsType", null);
        setField(term10997, term10997.getClass(), "parent", null);
        setField(term10995, term10995.getClass(), "next", term10997);
        setField(term10995, term10995.getClass(), "first", term10999);
        setIntField(term11006, term11006.getClass(), "type", -1420269858);
        setIntField(term11008, term11008.getClass(), "type", -2119545015);
        setField(term11008, term11008.getClass(), "next", null);
        setField(term11008, term11008.getClass(), "first", term11002);
        setField(term11008, term11008.getClass(), "last", term10997);
        setField(term11008, term11008.getClass(), "propListHead", null);
        setIntField(term11008, term11008.getClass(), "sourcePosition", 0);
        setField(term11008, term11008.getClass(), "jsType", null);
        setField(term11008, term11008.getClass(), "parent", null);
        setField(term11006, term11006.getClass(), "next", term11008);
        setField(term11006, term11006.getClass(), "first", term10993);
        setField(term11006, term11006.getClass(), "last", term10993);
        setField(term11006, term11006.getClass(), "propListHead", null);
        setIntField(term11006, term11006.getClass(), "sourcePosition", 0);
        setField(term11006, term11006.getClass(), "jsType", null);
        setField(term11006, term11006.getClass(), "parent", null);
        setField(term10995, term10995.getClass(), "last", term11006);
        setField(term10995, term10995.getClass(), "propListHead", null);
        setIntField(term10995, term10995.getClass(), "sourcePosition", 0);
        setField(term10995, term10995.getClass(), "jsType", null);
        setField(term10995, term10995.getClass(), "parent", null);
        setField(term10993, term10993.getClass(), "next", term10995);
        setIntField(term11013, term11013.getClass(), "type", 1272542218);
        setField(term11013, term11013.getClass(), "next", term11006);
        setField(term11013, term11013.getClass(), "first", term11008);
        setField(term11013, term11013.getClass(), "last", term10991);
        setField(term11013, term11013.getClass(), "propListHead", null);
        setIntField(term11013, term11013.getClass(), "sourcePosition", 0);
        setField(term11013, term11013.getClass(), "jsType", null);
        setField(term11013, term11013.getClass(), "parent", null);
        setField(term10993, term10993.getClass(), "first", term11013);
        setField(term10993, term10993.getClass(), "last", term11013);
        setField(term10993, term10993.getClass(), "propListHead", null);
        setIntField(term10993, term10993.getClass(), "sourcePosition", 0);
        setField(term10993, term10993.getClass(), "jsType", null);
        setField(term10993, term10993.getClass(), "parent", null);
        setField(term10991, term10991.getClass(), "next", term10993);
        setField(term10991, term10991.getClass(), "first", term10997);
        setField(term10991, term10991.getClass(), "last", term10999);
        setField(term10991, term10991.getClass(), "propListHead", null);
        setIntField(term10991, term10991.getClass(), "sourcePosition", 0);
        setField(term10991, term10991.getClass(), "jsType", null);
        setField(term10991, term10991.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term10989;
        args[1] = term10991;
        try {
            callMethod(klass, "newNode", argTypes, term10875, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


