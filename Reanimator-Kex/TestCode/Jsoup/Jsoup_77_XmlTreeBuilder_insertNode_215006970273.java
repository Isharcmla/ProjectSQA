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

public class XmlTreeBuilder_insertNode_215006970273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term428940;
     Object term429144;

    public XmlTreeBuilder_insertNode_215006970273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term429030 = newInstance(Class.forName("java.lang.Object"));
        Object term429084 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term428992 = new ArrayList();
        ((ArrayList) term428992).add(term429030);
        ((ArrayList) term428992).add(term429084);
        term428940 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term428940, term428940.getClass(), "stack", term428992);
        term429144 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term429196 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term429196, term429196.getClass(), "childNodes", null);
        setField(term429144, term429144.getClass(), "parentNode", term429196);
        setIntField(term429144, term429144.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = term429144;
        try {
            callMethod(klass, "insertNode", argTypes, term428940, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


