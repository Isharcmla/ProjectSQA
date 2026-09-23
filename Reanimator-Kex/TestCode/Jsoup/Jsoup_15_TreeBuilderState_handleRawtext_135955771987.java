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

public class TreeBuilderState_handleRawtext_135955771987 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192954;
     Object term193112;

    public TreeBuilderState_handleRawtext_135955771987() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term192954 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term193050 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setBooleanField(term192954, term192954.getClass(), "selfClosing", true);
        setField(term192954, term192954.getClass(), "tagName", "          ");
        setField(term192954, term192954.getClass(), "attributes", term193050);
        term193112 = newInstance(Class.forName("org.jsoup.parser.TreeBuilder"));
        Object term193232 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term193112, term193112.getClass(), "baseUri", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        setField(term193112, term193112.getClass(), "stack", term193232);
        setBooleanField(term193112, term193112.getClass(), "fosterInserts", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$StartTag");
        argTypes[1] = Class.forName("org.jsoup.parser.TreeBuilder");
        Object[] args = new Object[2];
        args[0] = term192954;
        args[1] = term193112;
        try {
            callMethod(klass, "handleRawtext", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


