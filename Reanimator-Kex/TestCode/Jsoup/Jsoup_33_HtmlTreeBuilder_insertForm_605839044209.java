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
import java.lang.IllegalArgumentException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class HtmlTreeBuilder_insertForm_605839044209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term415664;
     Object term415852;

    public HtmlTreeBuilder_insertForm_605839044209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term415664 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term415784 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term415664, term415664.getClass(), "baseUri", "");
        setField(term415664, term415664.getClass(), "formElement", null);
        setField(term415664, term415664.getClass(), "stack", term415784);
        setBooleanField(term415664, term415664.getClass(), "fosterInserts", true);
        term415852 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term415948 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term415852, term415852.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term415852, term415852.getClass(), "attributes", term415948);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$StartTag");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term415852;
        args[1] = false;
        try {
            callMethod(klass, "insertForm", argTypes, term415664, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


