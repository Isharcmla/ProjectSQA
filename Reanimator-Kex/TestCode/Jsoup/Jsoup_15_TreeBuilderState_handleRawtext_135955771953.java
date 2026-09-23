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

public class TreeBuilderState_handleRawtext_135955771953 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81570;
     Object term81728;

    public TreeBuilderState_handleRawtext_135955771953() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81570 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term81666 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setBooleanField(term81570, term81570.getClass(), "selfClosing", true);
        setField(term81570, term81570.getClass(), "tagName", "          ");
        setField(term81570, term81570.getClass(), "attributes", term81666);
        term81728 = newInstance(Class.forName("org.jsoup.parser.TreeBuilder"));
        Object term81848 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term81728, term81728.getClass(), "baseUri", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        setField(term81728, term81728.getClass(), "stack", term81848);
        setBooleanField(term81728, term81728.getClass(), "fosterInserts", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$StartTag");
        argTypes[1] = Class.forName("org.jsoup.parser.TreeBuilder");
        Object[] args = new Object[2];
        args[0] = term81570;
        args[1] = term81728;
        try {
            callMethod(klass, "handleRawtext", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


