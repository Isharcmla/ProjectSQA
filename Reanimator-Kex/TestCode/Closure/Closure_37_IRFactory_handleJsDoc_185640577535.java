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

public class IRFactory_handleJsDoc_185640577535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5620;
     Object term5739;

    public IRFactory_handleJsDoc_185640577535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5648 = new HashMap();
        HashMap term5657 = new HashMap();
        Set<Object> term27638 =  ((Map) term5657).keySet();
        HashSet term5656 = new HashSet((Collection<? extends Object>) term27638);
        Class<? extends Object> term27640 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term27639 = ((Class) term27640).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term27639).setAccessible(true);
        Object enum55 = ((Field) term27639).get((Object) null);
        HashMap term5681 = new HashMap();
        Set<Object> term27959 =  ((Map) term5681).keySet();
        HashSet term5680 = new HashSet((Collection<? extends Object>) term27959);
        HashMap term5698 = new HashMap();
        Set<Object> term27960 =  ((Map) term5698).keySet();
        HashSet term5697 = new HashSet((Collection<? extends Object>) term27960);
        HashMap term5709 = new HashMap();
        Set<Object> term27961 =  ((Map) term5709).keySet();
        HashSet term5708 = new HashSet((Collection<? extends Object>) term27961);
        term5620 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term5645 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term5679 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term5729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5732 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        Object term5733 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term5736 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term5620, term5620.getClass(), "sourceString", "PznxWXsZME");
        setField(term5620, term5620.getClass(), "sourceFile", null);
        setField(term5620, term5620.getClass(), "sourceName", "ZzIujlwVsw");
        setBooleanField(term5645, term5645.getClass(), "parseJsDocDocumentation", true);
        setBooleanField(term5645, term5645.getClass(), "isIdeMode", true);
        setField(term5645, term5645.getClass(), "annotationNames", term5648);
        setField(term5645, term5645.getClass(), "suppressionNames", term5656);
        setField(term5645, term5645.getClass(), "languageMode", enum55);
        setBooleanField(term5645, term5645.getClass(), "acceptConstKeyword", true);
        setField(term5620, term5620.getClass(), "config", term5645);
        setField(term5620, term5620.getClass(), "errorReporter", null);
        setField(term5679, term5679.getClass(), "this$0", null);
        setField(term5620, term5620.getClass(), "transformDispatcher", term5679);
        setField(term5620, term5620.getClass(), "ALLOWED_DIRECTIVES", term5680);
        setField(term5620, term5620.getClass(), "reservedKeywords", term5697);
        setField(term5620, term5620.getClass(), "parsedComments", term5708);
        setIntField(term5729, term5729.getClass(), "type", 0);
        setField(term5729, term5729.getClass(), "next", null);
        setField(term5729, term5729.getClass(), "first", null);
        setField(term5729, term5729.getClass(), "last", null);
        setField(term5729, term5729.getClass(), "propListHead", null);
        setIntField(term5729, term5729.getClass(), "sourcePosition", 0);
        setField(term5729, term5729.getClass(), "jsType", null);
        setField(term5729, term5729.getClass(), "parent", null);
        setField(term5620, term5620.getClass(), "rootNodeJsDocHolder", term5729);
        setField(term5732, term5732.getClass(), "this$0", null);
        setField(term5620, term5620.getClass(), "fileLevelJsDocBuilder", term5732);
        setField(term5733, term5733.getClass(), "info", null);
        setField(term5733, term5733.getClass(), "documentation", null);
        setField(term5733, term5733.getClass(), "associatedNode", null);
        setField(term5733, term5733.getClass(), "visibility", null);
        setIntField(term5733, term5733.getClass(), "bitset", 0);
        setField(term5733, term5733.getClass(), "type", null);
        setField(term5733, term5733.getClass(), "thisType", null);
        setBooleanField(term5733, term5733.getClass(), "includeDocumentation", false);
        setField(term5620, term5620.getClass(), "fileOverviewInfo", term5733);
        setIntField(term5736, term5736.getClass(), "type", 0);
        setField(term5736, term5736.getClass(), "next", null);
        setField(term5736, term5736.getClass(), "first", null);
        setField(term5736, term5736.getClass(), "last", null);
        setField(term5736, term5736.getClass(), "propListHead", null);
        setIntField(term5736, term5736.getClass(), "sourcePosition", 0);
        setField(term5736, term5736.getClass(), "jsType", null);
        setField(term5736, term5736.getClass(), "parent", null);
        setField(term5620, term5620.getClass(), "templateNode", term5736);
        term5739 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5741 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5743 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5745 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5747 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5750 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5754 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5756 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5761 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5739, term5739.getClass(), "type", 229204365);
        setIntField(term5741, term5741.getClass(), "type", -461771056);
        setIntField(term5743, term5743.getClass(), "type", -243422082);
        setIntField(term5745, term5745.getClass(), "type", 1384592638);
        setIntField(term5747, term5747.getClass(), "type", -1002370457);
        setField(term5747, term5747.getClass(), "next", null);
        setField(term5747, term5747.getClass(), "first", null);
        setField(term5747, term5747.getClass(), "last", null);
        setField(term5747, term5747.getClass(), "propListHead", null);
        setIntField(term5747, term5747.getClass(), "sourcePosition", 0);
        setField(term5747, term5747.getClass(), "jsType", null);
        setField(term5747, term5747.getClass(), "parent", null);
        setField(term5745, term5745.getClass(), "next", term5747);
        setIntField(term5750, term5750.getClass(), "type", -2014576105);
        setField(term5750, term5750.getClass(), "next", null);
        setField(term5750, term5750.getClass(), "first", null);
        setField(term5750, term5750.getClass(), "last", term5747);
        setField(term5750, term5750.getClass(), "propListHead", null);
        setIntField(term5750, term5750.getClass(), "sourcePosition", 0);
        setField(term5750, term5750.getClass(), "jsType", null);
        setField(term5750, term5750.getClass(), "parent", null);
        setField(term5745, term5745.getClass(), "first", term5750);
        setField(term5745, term5745.getClass(), "last", term5743);
        setField(term5745, term5745.getClass(), "propListHead", null);
        setIntField(term5745, term5745.getClass(), "sourcePosition", 0);
        setField(term5745, term5745.getClass(), "jsType", null);
        setField(term5745, term5745.getClass(), "parent", null);
        setField(term5743, term5743.getClass(), "next", term5745);
        setField(term5743, term5743.getClass(), "first", term5747);
        setIntField(term5754, term5754.getClass(), "type", 628918458);
        setIntField(term5756, term5756.getClass(), "type", -1274456137);
        setField(term5756, term5756.getClass(), "next", null);
        setField(term5756, term5756.getClass(), "first", term5750);
        setField(term5756, term5756.getClass(), "last", term5745);
        setField(term5756, term5756.getClass(), "propListHead", null);
        setIntField(term5756, term5756.getClass(), "sourcePosition", 0);
        setField(term5756, term5756.getClass(), "jsType", null);
        setField(term5756, term5756.getClass(), "parent", null);
        setField(term5754, term5754.getClass(), "next", term5756);
        setField(term5754, term5754.getClass(), "first", term5741);
        setField(term5754, term5754.getClass(), "last", term5741);
        setField(term5754, term5754.getClass(), "propListHead", null);
        setIntField(term5754, term5754.getClass(), "sourcePosition", 0);
        setField(term5754, term5754.getClass(), "jsType", null);
        setField(term5754, term5754.getClass(), "parent", null);
        setField(term5743, term5743.getClass(), "last", term5754);
        setField(term5743, term5743.getClass(), "propListHead", null);
        setIntField(term5743, term5743.getClass(), "sourcePosition", 0);
        setField(term5743, term5743.getClass(), "jsType", null);
        setField(term5743, term5743.getClass(), "parent", null);
        setField(term5741, term5741.getClass(), "next", term5743);
        setIntField(term5761, term5761.getClass(), "type", 1041916673);
        setField(term5761, term5761.getClass(), "next", term5754);
        setField(term5761, term5761.getClass(), "first", term5756);
        setField(term5761, term5761.getClass(), "last", term5739);
        setField(term5761, term5761.getClass(), "propListHead", null);
        setIntField(term5761, term5761.getClass(), "sourcePosition", 0);
        setField(term5761, term5761.getClass(), "jsType", null);
        setField(term5761, term5761.getClass(), "parent", null);
        setField(term5741, term5741.getClass(), "first", term5761);
        setField(term5741, term5741.getClass(), "last", term5761);
        setField(term5741, term5741.getClass(), "propListHead", null);
        setIntField(term5741, term5741.getClass(), "sourcePosition", 0);
        setField(term5741, term5741.getClass(), "jsType", null);
        setField(term5741, term5741.getClass(), "parent", null);
        setField(term5739, term5739.getClass(), "next", term5741);
        setField(term5739, term5739.getClass(), "first", term5745);
        setField(term5739, term5739.getClass(), "last", term5747);
        setField(term5739, term5739.getClass(), "propListHead", null);
        setIntField(term5739, term5739.getClass(), "sourcePosition", 0);
        setField(term5739, term5739.getClass(), "jsType", null);
        setField(term5739, term5739.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term5739;
        try {
            callMethod(klass, "handleJsDoc", argTypes, term5620, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


