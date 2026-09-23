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

public class Element_getElementById_402338892165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4096;

    public Element_getElementById_402338892165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4122 = new ArrayList();
        ((ArrayList) term4122).add((Object)null);
        ((ArrayList) term4122).add((Object)null);
        ((ArrayList) term4122).add((Object)null);
        ((ArrayList) term4122).add((Object)null);
        ((ArrayList) term4122).add((Object)null);
        ((ArrayList) term4122).add((Object)null);
        ((ArrayList) term4122).add((Object)null);
        ((ArrayList) term4122).add((Object)null);
        ((ArrayList) term4122).add((Object)null);
        term4096 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4097 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4118 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term4119 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term4120 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term4126 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term4128 = (Object[]) newArray("java.lang.String", 0);
        Object[] term4129 = (Object[]) newArray("java.lang.String", 0);
        setField(term4097, term4097.getClass(), "tagName", "EYtfuJaxiM");
        setBooleanField(term4097, term4097.getClass(), "isBlock", false);
        setBooleanField(term4097, term4097.getClass(), "formatAsBlock", false);
        setBooleanField(term4097, term4097.getClass(), "canContainInline", true);
        setBooleanField(term4097, term4097.getClass(), "empty", true);
        setBooleanField(term4097, term4097.getClass(), "selfClosing", false);
        setBooleanField(term4097, term4097.getClass(), "preserveWhitespace", true);
        setBooleanField(term4097, term4097.getClass(), "formList", false);
        setBooleanField(term4097, term4097.getClass(), "formSubmit", true);
        setField(term4096, term4096.getClass(), "tag", term4097);
        setField(term4118, term4118.getClass(), "referent", null);
        setField(term4119, term4119.getClass(), "lock", term4120);
        setField(term4119, term4119.getClass(), "head", null);
        setLongField(term4119, term4119.getClass(), "queueLength", -1468719814009985452L);
        setField(term4118, term4118.getClass(), "queue", term4119);
        setField(term4118, term4118.getClass(), "next", null);
        setField(term4118, term4118.getClass(), "discovered", null);
        setField(term4096, term4096.getClass(), "shadowChildrenRef", term4118);
        setField(term4096, term4096.getClass(), "childNodes", term4122);
        setIntField(term4126, term4126.getClass(), "size", 890669485);
        setField(term4126, term4126.getClass(), "keys", term4128);
        setField(term4126, term4126.getClass(), "vals", term4129);
        setField(term4096, term4096.getClass(), "attributes", term4126);
        setField(term4096, term4096.getClass(), "baseUri", "gCWtLVKVVe");
        setField(term4096, term4096.getClass(), "parentNode", null);
        setIntField(term4096, term4096.getClass(), "siblingIndex", 691577392);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fWKJoSoCwE";
        try {
            callMethod(klass, "getElementById", argTypes, term4096, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


