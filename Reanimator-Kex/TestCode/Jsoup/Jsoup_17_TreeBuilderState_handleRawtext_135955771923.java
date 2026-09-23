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

public class TreeBuilderState_handleRawtext_135955771923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44160;
     Object term44318;

    public TreeBuilderState_handleRawtext_135955771923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44160 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term44256 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setBooleanField(term44160, term44160.getClass(), "selfClosing", true);
        setField(term44160, term44160.getClass(), "tagName", "          ");
        setField(term44160, term44160.getClass(), "attributes", term44256);
        term44318 = newInstance(Class.forName("org.jsoup.parser.TreeBuilder"));
        Object term44438 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term44318, term44318.getClass(), "baseUri", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            ");
        setField(term44318, term44318.getClass(), "stack", term44438);
        setBooleanField(term44318, term44318.getClass(), "fosterInserts", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TreeBuilderState");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$StartTag");
        argTypes[1] = Class.forName("org.jsoup.parser.TreeBuilder");
        Object[] args = new Object[2];
        args[0] = term44160;
        args[1] = term44318;
        try {
            callMethod(klass, "handleRawtext", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


