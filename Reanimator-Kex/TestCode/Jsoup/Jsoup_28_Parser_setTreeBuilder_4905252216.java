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

public class Parser_setTreeBuilder_4905252216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57;
     Object term644;
     Object term638;

    public Parser_setTreeBuilder_4905252216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term59 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setField(term57, term57.getClass(), "treeBuilder", null);
        setIntField(term57, term57.getClass(), "maxErrors", -616727354);
        setIntField(term59, term59.getClass(), "maxSize", 0);
        setField(term59, term59.getClass(), "elementData", null);
        setIntField(term59, term59.getClass(), "size", 0);
        setIntField(term59, term59.getClass(), "modCount", 0);
        setField(term57, term57.getClass(), "errors", term59);
        term644 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term645 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setField(term644, term644.getClass(), "treeBuilder", null);
        setIntField(term644, term644.getClass(), "maxErrors", -616727354);
        setIntField(term645, term645.getClass(), "maxSize", 0);
        setField(term645, term645.getClass(), "elementData", null);
        setIntField(term645, term645.getClass(), "size", 0);
        setIntField(term645, term645.getClass(), "modCount", 0);
        setField(term644, term644.getClass(), "errors", term645);
        term638 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term640 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        setField(term638, term638.getClass(), "treeBuilder", null);
        setIntField(term638, term638.getClass(), "maxErrors", -616727354);
        setIntField(term640, term640.getClass(), "maxSize", 0);
        setField(term640, term640.getClass(), "elementData", null);
        setIntField(term640, term640.getClass(), "size", 0);
        setIntField(term640, term640.getClass(), "modCount", 0);
        setField(term638, term638.getClass(), "errors", term640);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.TreeBuilder");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "setTreeBuilder", argTypes, term57, args);
        assertTrue(recursiveEquals(term57, term644));
        assertTrue(recursiveEquals(retValue, term638));
    }

};


