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
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class XmlTreeBuilder_insertNode_215006970457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term383676;
     Object term383854;

    public XmlTreeBuilder_insertNode_215006970457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term383782 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term383728 = new ArrayList();
        ((ArrayList) term383728).add((Object)null);
        ((ArrayList) term383728).add(term383782);
        term383676 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term383676, term383676.getClass(), "stack", term383728);
        term383854 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = term383854;
        try {
            callMethod(klass, "insertNode", argTypes, term383676, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


