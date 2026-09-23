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

public class XmlTreeBuilder_insertNode_215006970642 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term468532;
     Object term468736;

    public XmlTreeBuilder_insertNode_215006970642() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term468622 = newInstance(Class.forName("java.lang.Object"));
        Object term468682 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        ArrayList term468584 = new ArrayList();
        ((ArrayList) term468584).add(term468622);
        ((ArrayList) term468584).add(term468622);
        ((ArrayList) term468584).add(term468622);
        ((ArrayList) term468584).add(term468622);
        ((ArrayList) term468584).add(term468622);
        ((ArrayList) term468584).add(term468622);
        ((ArrayList) term468584).add(term468622);
        ((ArrayList) term468584).add(term468682);
        term468532 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term468532, term468532.getClass(), "stack", term468584);
        ArrayList term468842 = new ArrayList();
        term468736 = newInstance(Class.forName("org.jsoup.nodes.DataNode"));
        Object term468790 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        setField(term468790, term468790.getClass(), "childNodes", term468842);
        setField(term468736, term468736.getClass(), "parentNode", term468790);
        setIntField(term468736, term468736.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = term468736;
        try {
            callMethod(klass, "insertNode", argTypes, term468532, args);
            assertTrue(false);
        }
        catch (IndexOutOfBoundsException e) {
        }

    }

};


