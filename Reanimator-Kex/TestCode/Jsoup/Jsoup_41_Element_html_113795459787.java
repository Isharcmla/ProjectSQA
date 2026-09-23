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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_html_113795459787 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7867;
     Object term7919;

    public Element_html_113795459787() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7890 = new ArrayList();
        ((ArrayList) term7890).add((Object)null);
        ((ArrayList) term7890).add((Object)null);
        ((ArrayList) term7890).add((Object)null);
        ((ArrayList) term7890).add((Object)null);
        ((ArrayList) term7890).add((Object)null);
        ((ArrayList) term7890).add((Object)null);
        ((ArrayList) term7890).add((Object)null);
        ((ArrayList) term7890).add((Object)null);
        ((ArrayList) term7890).add((Object)null);
        LinkedHashMap term7895 = new LinkedHashMap();
        term7867 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7868 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7894 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term7868, term7868.getClass(), "tagName", "IApvtmfhnq");
        setBooleanField(term7868, term7868.getClass(), "isBlock", true);
        setBooleanField(term7868, term7868.getClass(), "formatAsBlock", false);
        setBooleanField(term7868, term7868.getClass(), "canContainBlock", true);
        setBooleanField(term7868, term7868.getClass(), "canContainInline", false);
        setBooleanField(term7868, term7868.getClass(), "empty", false);
        setBooleanField(term7868, term7868.getClass(), "selfClosing", false);
        setBooleanField(term7868, term7868.getClass(), "preserveWhitespace", true);
        setBooleanField(term7868, term7868.getClass(), "formList", true);
        setBooleanField(term7868, term7868.getClass(), "formSubmit", false);
        setField(term7867, term7867.getClass(), "tag", term7868);
        setField(term7867, term7867.getClass(), "parentNode", null);
        setField(term7867, term7867.getClass(), "childNodes", term7890);
        setField(term7894, term7894.getClass(), "attributes", term7895);
        setField(term7867, term7867.getClass(), "attributes", term7894);
        setField(term7867, term7867.getClass(), "baseUri", "RjNoEywJbC");
        setIntField(term7867, term7867.getClass(), "siblingIndex", -601863069);
        term7919 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term7920 = (byte[]) newByteArray(16);
        setField(term7919, term7919.getClass(), "value", term7920);
        setByteField(term7919, term7919.getClass(), "coder", (byte) -58);
        setIntField(term7919, term7919.getClass(), "count", 663292551);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        Object[] args = new Object[1];
        args[0] = term7919;
        callMethod(klass, "html", argTypes, term7867, args);
    }

};


