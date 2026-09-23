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

public class IRFactory_setFileOverviewJsDoc_1930902895565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114802;
     Object term115310;
     Object term115732;
     Object term115738;

    public IRFactory_setFileOverviewJsDoc_1930902895565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114802 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term114872 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term114968 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term115454 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term115502 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term115240 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term114968, term114968.getClass(), "type", 1496981595);
        setIntField(term115454, term115454.getClass(), "type", 29);
        setField(term115454, term115454.getClass(), "objectValue", null);
        setField(term115454, term115454.getClass(), "next", term115502);
        setField(term114968, term114968.getClass(), "next", term115454);
        setField(term114872, term114872.getClass(), "propListHead", term114968);
        setField(term114802, term114802.getClass(), "rootNodeJsDocHolder", term114872);
        setField(term114802, term114802.getClass(), "fileOverviewInfo", term115240);
        term115310 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term115406 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term115582 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term115406, term115406.getClass(), "type", -2101289052);
        setField(term115406, term115406.getClass(), "next", term115454);
        setIntField(term115406, term115406.getClass(), "intValue", 0);
        setField(term115406, term115406.getClass(), "objectValue", term115582);
        setField(term115310, term115310.getClass(), "propListHead", term115406);
        term115732 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term115733 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term115734 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term115735 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term115736 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term115737 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term115732, term115732.getClass(), "sourceString", null);
        setField(term115732, term115732.getClass(), "sourceName", null);
        setField(term115732, term115732.getClass(), "config", null);
        setField(term115732, term115732.getClass(), "errorReporter", null);
        setField(term115732, term115732.getClass(), "transformDispatcher", null);
        setField(term115732, term115732.getClass(), "ALLOWED_DIRECTIVES", null);
        setField(term115732, term115732.getClass(), "reservedKeywords", null);
        setIntField(term115733, term115733.getClass(), "type", 0);
        setField(term115733, term115733.getClass(), "next", null);
        setField(term115733, term115733.getClass(), "first", null);
        setField(term115733, term115733.getClass(), "last", null);
        setField(term115736, term115736.getClass(), "next", null);
        setIntField(term115736, term115736.getClass(), "type", 0);
        setIntField(term115736, term115736.getClass(), "intValue", 0);
        setField(term115736, term115736.getClass(), "objectValue", null);
        setField(term115735, term115735.getClass(), "next", term115736);
        setIntField(term115735, term115735.getClass(), "type", 29);
        setIntField(term115735, term115735.getClass(), "intValue", 0);
        setField(term115735, term115735.getClass(), "objectValue", null);
        setField(term115734, term115734.getClass(), "next", term115735);
        setIntField(term115734, term115734.getClass(), "type", 1496981595);
        setIntField(term115734, term115734.getClass(), "intValue", 0);
        setField(term115734, term115734.getClass(), "objectValue", null);
        setField(term115733, term115733.getClass(), "propListHead", term115734);
        setIntField(term115733, term115733.getClass(), "sourcePosition", 0);
        setField(term115733, term115733.getClass(), "jsType", null);
        setField(term115733, term115733.getClass(), "parent", null);
        setField(term115732, term115732.getClass(), "rootNodeJsDocHolder", term115733);
        setField(term115732, term115732.getClass(), "fileLevelJsDocBuilder", null);
        setField(term115737, term115737.getClass(), "info", null);
        setField(term115737, term115737.getClass(), "documentation", null);
        setField(term115737, term115737.getClass(), "sourceName", null);
        setField(term115737, term115737.getClass(), "visibility", null);
        setIntField(term115737, term115737.getClass(), "bitset", 0);
        setField(term115737, term115737.getClass(), "type", null);
        setField(term115737, term115737.getClass(), "thisType", null);
        setBooleanField(term115737, term115737.getClass(), "includeDocumentation", false);
        setField(term115732, term115732.getClass(), "fileOverviewInfo", term115737);
        setField(term115732, term115732.getClass(), "templateNode", null);
        term115738 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term115739 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term115740 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term115741 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term115742 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term115743 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term115738, term115738.getClass(), "type", 0);
        setField(term115738, term115738.getClass(), "next", null);
        setField(term115738, term115738.getClass(), "first", null);
        setField(term115738, term115738.getClass(), "last", null);
        setField(term115741, term115741.getClass(), "next", null);
        setIntField(term115741, term115741.getClass(), "type", 0);
        setIntField(term115741, term115741.getClass(), "intValue", 0);
        setField(term115741, term115741.getClass(), "objectValue", null);
        setField(term115740, term115740.getClass(), "next", term115741);
        setIntField(term115740, term115740.getClass(), "type", -2101289052);
        setIntField(term115740, term115740.getClass(), "intValue", 0);
        setField(term115742, term115742.getClass(), "info", null);
        setField(term115742, term115742.getClass(), "documentation", null);
        setField(term115742, term115742.getClass(), "sourceName", null);
        setField(term115742, term115742.getClass(), "visibility", null);
        setIntField(term115742, term115742.getClass(), "bitset", 0);
        setField(term115742, term115742.getClass(), "type", null);
        setField(term115742, term115742.getClass(), "thisType", null);
        setBooleanField(term115742, term115742.getClass(), "includeDocumentation", false);
        setField(term115740, term115740.getClass(), "objectValue", term115742);
        setField(term115739, term115739.getClass(), "next", term115740);
        setIntField(term115739, term115739.getClass(), "type", 29);
        setIntField(term115739, term115739.getClass(), "intValue", 0);
        setField(term115743, term115743.getClass(), "info", null);
        setField(term115743, term115743.getClass(), "documentation", null);
        setField(term115743, term115743.getClass(), "sourceName", null);
        setField(term115743, term115743.getClass(), "visibility", null);
        setIntField(term115743, term115743.getClass(), "bitset", 0);
        setField(term115743, term115743.getClass(), "type", null);
        setField(term115743, term115743.getClass(), "thisType", null);
        setBooleanField(term115743, term115743.getClass(), "includeDocumentation", false);
        setField(term115739, term115739.getClass(), "objectValue", term115743);
        setField(term115738, term115738.getClass(), "propListHead", term115739);
        setIntField(term115738, term115738.getClass(), "sourcePosition", 0);
        setField(term115738, term115738.getClass(), "jsType", null);
        setField(term115738, term115738.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term115310;
        callMethod(klass, "setFileOverviewJsDoc", argTypes, term114802, args);
        assertTrue(recursiveEquals(term114802, term115732));
        assertTrue(recursiveEquals(term115310, term115738));
    }

};


