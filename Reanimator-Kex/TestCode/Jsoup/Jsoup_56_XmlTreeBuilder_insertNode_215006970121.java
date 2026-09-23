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
import java.lang.IndexOutOfBoundsException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class XmlTreeBuilder_insertNode_215006970121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138428;
     Object term138584;

    public XmlTreeBuilder_insertNode_215006970121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term138532 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        ArrayList term138480 = new ArrayList();
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add((Object)null);
        ((ArrayList) term138480).add(term138532);
        term138428 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term138428, term138428.getClass(), "stack", term138480);
        ArrayList term138688 = new ArrayList();
        term138584 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term138636 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term138636, term138636.getClass(), "childNodes", term138688);
        setField(term138584, term138584.getClass(), "parentNode", term138636);
        setIntField(term138584, term138584.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = term138584;
        try {
            callMethod(klass, "insertNode", argTypes, term138428, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


