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

public class XmlTreeBuilder_insertNode_215006970331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term462941;
     Object term463165;

    public XmlTreeBuilder_insertNode_215006970331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term463031 = newInstance(Class.forName("java.lang.Object"));
        Object term463103 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        setField(term463103, term463103.getClass(), "childNodes", null);
        ArrayList term462993 = new ArrayList();
        ((ArrayList) term462993).add(term463031);
        ((ArrayList) term462993).add(term463031);
        ((ArrayList) term462993).add(term463031);
        ((ArrayList) term462993).add(term463031);
        ((ArrayList) term462993).add(term463031);
        ((ArrayList) term462993).add(term463031);
        ((ArrayList) term462993).add(term463031);
        ((ArrayList) term462993).add(term463103);
        term462941 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term462941, term462941.getClass(), "stack", term462993);
        term463165 = newInstance(Class.forName("org.jsoup.nodes.DocumentType"));
        setField(term463165, term463165.getClass(), "parentNode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = term463165;
        try {
            callMethod(klass, "insertNode", argTypes, term462941, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


