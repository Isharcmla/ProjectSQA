package org.jsoup.nodes;

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
import java.lang.ExceptionInInitializerError;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedHashMap;

public class XmlDeclaration_toString_83989101813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term903;

    public XmlDeclaration_toString_83989101813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term917 = new ArrayList();
        ((ArrayList) term917).add((Object)null);
        ((ArrayList) term917).add((Object)null);
        ((ArrayList) term917).add((Object)null);
        ((ArrayList) term917).add((Object)null);
        ((ArrayList) term917).add((Object)null);
        ((ArrayList) term917).add((Object)null);
        LinkedHashMap term922 = new LinkedHashMap();
        term903 = newInstance(Class.forName("org.jsoup.nodes.XmlDeclaration"));
        Object term921 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term903, term903.getClass(), "name", "OclPbYPkcH");
        setBooleanField(term903, term903.getClass(), "isProcessingInstruction", false);
        setField(term903, term903.getClass(), "parentNode", null);
        setField(term903, term903.getClass(), "childNodes", term917);
        setField(term921, term921.getClass(), "attributes", term922);
        setField(term903, term903.getClass(), "attributes", term921);
        setField(term903, term903.getClass(), "baseUri", "dWRymuLBtr");
        setIntField(term903, term903.getClass(), "siblingIndex", -1339778481);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.XmlDeclaration");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toString", argTypes, term903, args);
            assertTrue(false);
        }
        catch (ExceptionInInitializerError e) {
        }

    }

};


