package org.jsoup.parser;

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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.parser.EqualityUtils.*;
import java.lang.Object;

public class Parser_setTreeBuilder_4905252220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63;
     Object term1105;
     Object term1096;

    public Parser_setTreeBuilder_4905252220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term65 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term69 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term63, term63.getClass(), "treeBuilder", null);
        setIntField(term63, term63.getClass(), "maxErrors", -616727354);
        setIntField(term65, term65.getClass(), "maxSize", 0);
        setField(term65, term65.getClass(), "elementData", null);
        setIntField(term65, term65.getClass(), "size", 0);
        setIntField(term65, term65.getClass(), "modCount", 0);
        setField(term63, term63.getClass(), "errors", term65);
        setBooleanField(term69, term69.getClass(), "preserveTagCase", true);
        setBooleanField(term69, term69.getClass(), "preserveAttributeCase", true);
        setField(term63, term63.getClass(), "settings", term69);
        term1105 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term1106 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term1107 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term1105, term1105.getClass(), "treeBuilder", null);
        setIntField(term1105, term1105.getClass(), "maxErrors", -616727354);
        setIntField(term1106, term1106.getClass(), "maxSize", 0);
        setField(term1106, term1106.getClass(), "elementData", null);
        setIntField(term1106, term1106.getClass(), "size", 0);
        setIntField(term1106, term1106.getClass(), "modCount", 0);
        setField(term1105, term1105.getClass(), "errors", term1106);
        setBooleanField(term1107, term1107.getClass(), "preserveTagCase", true);
        setBooleanField(term1107, term1107.getClass(), "preserveAttributeCase", true);
        setField(term1105, term1105.getClass(), "settings", term1107);
        term1096 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term1098 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term1102 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term1096, term1096.getClass(), "treeBuilder", null);
        setIntField(term1096, term1096.getClass(), "maxErrors", -616727354);
        setIntField(term1098, term1098.getClass(), "maxSize", 0);
        setField(term1098, term1098.getClass(), "elementData", null);
        setIntField(term1098, term1098.getClass(), "size", 0);
        setIntField(term1098, term1098.getClass(), "modCount", 0);
        setField(term1096, term1096.getClass(), "errors", term1098);
        setBooleanField(term1102, term1102.getClass(), "preserveTagCase", true);
        setBooleanField(term1102, term1102.getClass(), "preserveAttributeCase", true);
        setField(term1096, term1096.getClass(), "settings", term1102);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.TreeBuilder");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "setTreeBuilder", argTypes, term63, args);
        assertTrue(recursiveEquals(term63, term1105));
        assertTrue(recursiveEquals(retValue, term1096));
    }

};


