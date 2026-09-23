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
import java.lang.Integer;

public class IRFactory_newNode_155996010760 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14486;
     Object term14587;
     Object term46823;
     Object term46741;

    public IRFactory_newNode_155996010760() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term14514 = new HashMap();
        HashMap term14523 = new HashMap();
        Set<Object> term46864 =  ((Map) term14523).keySet();
        HashSet term14522 = new HashSet((Collection<? extends Object>) term46864);
        Class<? extends Object> term46866 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term46865 = ((Class) term46866).getDeclaredField((String) "ECMASCRIPT5");
        ((Field) term46865).setAccessible(true);
        Object enum93 = ((Field) term46865).get((Object) null);
        HashMap term14547 = new HashMap();
        Set<Object> term47185 =  ((Map) term14547).keySet();
        HashSet term14546 = new HashSet((Collection<? extends Object>) term47185);
        HashMap term14564 = new HashMap();
        Set<Object> term47186 =  ((Map) term14564).keySet();
        HashSet term14563 = new HashSet((Collection<? extends Object>) term47186);
        term14486 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term14511 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term14545 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term14576 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14579 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        Object term14580 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term14584 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term14486, term14486.getClass(), "sourceString", "qYtAeLzOhW");
        setField(term14486, term14486.getClass(), "sourceFile", null);
        setField(term14486, term14486.getClass(), "sourceName", "tJzmOfcUnY");
        setBooleanField(term14511, term14511.getClass(), "parseJsDocDocumentation", true);
        setBooleanField(term14511, term14511.getClass(), "isIdeMode", true);
        setField(term14511, term14511.getClass(), "annotationNames", term14514);
        setField(term14511, term14511.getClass(), "suppressionNames", term14522);
        setField(term14511, term14511.getClass(), "languageMode", enum93);
        setBooleanField(term14511, term14511.getClass(), "acceptConstKeyword", true);
        setField(term14486, term14486.getClass(), "config", term14511);
        setField(term14486, term14486.getClass(), "errorReporter", null);
        setField(term14545, term14545.getClass(), "this$0", null);
        setField(term14486, term14486.getClass(), "transformDispatcher", term14545);
        setField(term14486, term14486.getClass(), "reservedKeywords", term14546);
        setField(term14486, term14486.getClass(), "parsedComments", term14563);
        setIntField(term14576, term14576.getClass(), "type", 0);
        setField(term14576, term14576.getClass(), "next", null);
        setField(term14576, term14576.getClass(), "first", null);
        setField(term14576, term14576.getClass(), "last", null);
        setField(term14576, term14576.getClass(), "propListHead", null);
        setIntField(term14576, term14576.getClass(), "sourcePosition", 0);
        setField(term14576, term14576.getClass(), "jsType", null);
        setField(term14576, term14576.getClass(), "parent", null);
        setField(term14486, term14486.getClass(), "rootNodeJsDocHolder", term14576);
        setField(term14579, term14579.getClass(), "this$0", null);
        setField(term14486, term14486.getClass(), "fileLevelJsDocBuilder", term14579);
        setField(term14580, term14580.getClass(), "info", null);
        setField(term14580, term14580.getClass(), "documentation", null);
        setField(term14580, term14580.getClass(), "associatedNode", null);
        setField(term14580, term14580.getClass(), "visibility", null);
        setIntField(term14580, term14580.getClass(), "bitset", 0);
        setField(term14580, term14580.getClass(), "type", null);
        setField(term14580, term14580.getClass(), "thisType", null);
        setBooleanField(term14580, term14580.getClass(), "includeDocumentation", false);
        setIntField(term14580, term14580.getClass(), "originalCommentPosition", 0);
        setField(term14486, term14486.getClass(), "fileOverviewInfo", term14580);
        setIntField(term14584, term14584.getClass(), "type", 0);
        setField(term14584, term14584.getClass(), "next", null);
        setField(term14584, term14584.getClass(), "first", null);
        setField(term14584, term14584.getClass(), "last", null);
        setField(term14584, term14584.getClass(), "propListHead", null);
        setIntField(term14584, term14584.getClass(), "sourcePosition", 0);
        setField(term14584, term14584.getClass(), "jsType", null);
        setField(term14584, term14584.getClass(), "parent", null);
        setField(term14486, term14486.getClass(), "templateNode", term14584);
        term14587 = new Integer(1638851942);
        HashMap term46829 = new HashMap();
        HashMap term46831 = new HashMap();
        Set<Object> term47207 =  ((Map) term46831).keySet();
        HashSet term46830 = new HashSet((Collection<? extends Object>) term47207);
        Class<? extends Object> term47209 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term47208 = ((Class) term47209).getDeclaredField((String) "ECMASCRIPT5");
        ((Field) term47208).setAccessible(true);
        Object enum94 = ((Field) term47208).get((Object) null);
        HashMap term46837 = new HashMap();
        Set<Object> term47528 =  ((Map) term46837).keySet();
        HashSet term46836 = new HashSet((Collection<? extends Object>) term47528);
        HashMap term46839 = new HashMap();
        Set<Object> term47529 =  ((Map) term46839).keySet();
        HashSet term46838 = new HashSet((Collection<? extends Object>) term47529);
        term46823 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term46828 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term46835 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term46840 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term46841 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        Object term46842 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term46843 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term46823, term46823.getClass(), "sourceString", "qYtAeLzOhW");
        setField(term46823, term46823.getClass(), "sourceFile", null);
        setField(term46823, term46823.getClass(), "sourceName", "tJzmOfcUnY");
        setBooleanField(term46828, term46828.getClass(), "parseJsDocDocumentation", true);
        setBooleanField(term46828, term46828.getClass(), "isIdeMode", true);
        setField(term46828, term46828.getClass(), "annotationNames", term46829);
        setField(term46828, term46828.getClass(), "suppressionNames", term46830);
        setField(term46828, term46828.getClass(), "languageMode", enum94);
        setBooleanField(term46828, term46828.getClass(), "acceptConstKeyword", true);
        setField(term46823, term46823.getClass(), "config", term46828);
        setField(term46823, term46823.getClass(), "errorReporter", null);
        setField(term46835, term46835.getClass(), "this$0", null);
        setField(term46823, term46823.getClass(), "transformDispatcher", term46835);
        setField(term46823, term46823.getClass(), "reservedKeywords", term46836);
        setField(term46823, term46823.getClass(), "parsedComments", term46838);
        setIntField(term46840, term46840.getClass(), "type", 0);
        setField(term46840, term46840.getClass(), "next", null);
        setField(term46840, term46840.getClass(), "first", null);
        setField(term46840, term46840.getClass(), "last", null);
        setField(term46840, term46840.getClass(), "propListHead", null);
        setIntField(term46840, term46840.getClass(), "sourcePosition", 0);
        setField(term46840, term46840.getClass(), "jsType", null);
        setField(term46840, term46840.getClass(), "parent", null);
        setField(term46823, term46823.getClass(), "rootNodeJsDocHolder", term46840);
        setField(term46841, term46841.getClass(), "this$0", null);
        setField(term46823, term46823.getClass(), "fileLevelJsDocBuilder", term46841);
        setField(term46842, term46842.getClass(), "info", null);
        setField(term46842, term46842.getClass(), "documentation", null);
        setField(term46842, term46842.getClass(), "associatedNode", null);
        setField(term46842, term46842.getClass(), "visibility", null);
        setIntField(term46842, term46842.getClass(), "bitset", 0);
        setField(term46842, term46842.getClass(), "type", null);
        setField(term46842, term46842.getClass(), "thisType", null);
        setBooleanField(term46842, term46842.getClass(), "includeDocumentation", false);
        setIntField(term46842, term46842.getClass(), "originalCommentPosition", 0);
        setField(term46823, term46823.getClass(), "fileOverviewInfo", term46842);
        setIntField(term46843, term46843.getClass(), "type", 0);
        setField(term46843, term46843.getClass(), "next", null);
        setField(term46843, term46843.getClass(), "first", null);
        setField(term46843, term46843.getClass(), "last", null);
        setField(term46843, term46843.getClass(), "propListHead", null);
        setIntField(term46843, term46843.getClass(), "sourcePosition", 0);
        setField(term46843, term46843.getClass(), "jsType", null);
        setField(term46843, term46843.getClass(), "parent", null);
        setField(term46823, term46823.getClass(), "templateNode", term46843);
        term46741 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term46741, term46741.getClass(), "type", 1638851942);
        setField(term46741, term46741.getClass(), "next", null);
        setField(term46741, term46741.getClass(), "first", null);
        setField(term46741, term46741.getClass(), "last", null);
        setField(term46741, term46741.getClass(), "propListHead", null);
        setIntField(term46741, term46741.getClass(), "sourcePosition", -1);
        setField(term46741, term46741.getClass(), "jsType", null);
        setField(term46741, term46741.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term14587;
        Object retValue = callMethod(klass, "newNode", argTypes, term14486, args);
        assertTrue(recursiveEquals(term14486, term46823));
        assertTrue(recursiveEquals(term14587, 1638851942));
        assertTrue(recursiveEquals(retValue, term46741));
    }

};


