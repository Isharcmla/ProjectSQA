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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class Element_getElementsByAttributeValueMatching_1502127233175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5196;

    public Element_getElementsByAttributeValueMatching_1502127233175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5222 = new ArrayList();
        ((ArrayList) term5222).add((Object)null);
        ((ArrayList) term5222).add((Object)null);
        ((ArrayList) term5222).add((Object)null);
        ((ArrayList) term5222).add((Object)null);
        ((ArrayList) term5222).add((Object)null);
        ((ArrayList) term5222).add((Object)null);
        ((ArrayList) term5222).add((Object)null);
        ((ArrayList) term5222).add((Object)null);
        ((ArrayList) term5222).add((Object)null);
        term5196 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5197 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5218 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term5219 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term5220 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term5226 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5228 = (Object[]) newArray("java.lang.String", 0);
        Object[] term5229 = (Object[]) newArray("java.lang.String", 0);
        setField(term5197, term5197.getClass(), "tagName", "rLHAoqXgPh");
        setBooleanField(term5197, term5197.getClass(), "isBlock", true);
        setBooleanField(term5197, term5197.getClass(), "formatAsBlock", true);
        setBooleanField(term5197, term5197.getClass(), "canContainInline", true);
        setBooleanField(term5197, term5197.getClass(), "empty", false);
        setBooleanField(term5197, term5197.getClass(), "selfClosing", false);
        setBooleanField(term5197, term5197.getClass(), "preserveWhitespace", false);
        setBooleanField(term5197, term5197.getClass(), "formList", false);
        setBooleanField(term5197, term5197.getClass(), "formSubmit", false);
        setField(term5196, term5196.getClass(), "tag", term5197);
        setField(term5218, term5218.getClass(), "referent", null);
        setField(term5219, term5219.getClass(), "lock", term5220);
        setField(term5219, term5219.getClass(), "head", null);
        setLongField(term5219, term5219.getClass(), "queueLength", -8658027316505137504L);
        setField(term5218, term5218.getClass(), "queue", term5219);
        setField(term5218, term5218.getClass(), "next", null);
        setField(term5218, term5218.getClass(), "discovered", null);
        setField(term5196, term5196.getClass(), "shadowChildrenRef", term5218);
        setField(term5196, term5196.getClass(), "childNodes", term5222);
        setIntField(term5226, term5226.getClass(), "size", 98922530);
        setField(term5226, term5226.getClass(), "keys", term5228);
        setField(term5226, term5226.getClass(), "vals", term5229);
        setField(term5196, term5196.getClass(), "attributes", term5226);
        setField(term5196, term5196.getClass(), "baseUri", "zUlRdimJtU");
        setField(term5196, term5196.getClass(), "parentNode", null);
        setIntField(term5196, term5196.getClass(), "siblingIndex", -1388471422);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "vwbEQQNQrx";
        args[1] = "xtftXXMbem";
        try {
            callMethod(klass, "getElementsByAttributeValueMatching", argTypes, term5196, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


