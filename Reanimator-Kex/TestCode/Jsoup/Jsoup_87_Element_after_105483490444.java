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

public class Element_after_105483490444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3156;

    public Element_after_105483490444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3182 = new ArrayList();
        ((ArrayList) term3182).add((Object)null);
        ((ArrayList) term3182).add((Object)null);
        term3156 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3157 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3178 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term3179 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term3180 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term3186 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term3188 = (Object[]) newArray("java.lang.String", 0);
        Object[] term3189 = (Object[]) newArray("java.lang.String", 0);
        setField(term3157, term3157.getClass(), "tagName", "QXzGXbEXMu");
        setBooleanField(term3157, term3157.getClass(), "isBlock", false);
        setBooleanField(term3157, term3157.getClass(), "formatAsBlock", true);
        setBooleanField(term3157, term3157.getClass(), "canContainInline", true);
        setBooleanField(term3157, term3157.getClass(), "empty", true);
        setBooleanField(term3157, term3157.getClass(), "selfClosing", false);
        setBooleanField(term3157, term3157.getClass(), "preserveWhitespace", true);
        setBooleanField(term3157, term3157.getClass(), "formList", true);
        setBooleanField(term3157, term3157.getClass(), "formSubmit", false);
        setField(term3156, term3156.getClass(), "tag", term3157);
        setField(term3178, term3178.getClass(), "referent", null);
        setField(term3179, term3179.getClass(), "lock", term3180);
        setField(term3179, term3179.getClass(), "head", null);
        setLongField(term3179, term3179.getClass(), "queueLength", -6292278961887936280L);
        setField(term3178, term3178.getClass(), "queue", term3179);
        setField(term3178, term3178.getClass(), "next", null);
        setField(term3178, term3178.getClass(), "discovered", null);
        setField(term3156, term3156.getClass(), "shadowChildrenRef", term3178);
        setField(term3156, term3156.getClass(), "childNodes", term3182);
        setIntField(term3186, term3186.getClass(), "size", 1114000454);
        setField(term3186, term3186.getClass(), "keys", term3188);
        setField(term3186, term3186.getClass(), "vals", term3189);
        setField(term3156, term3156.getClass(), "attributes", term3186);
        setField(term3156, term3156.getClass(), "baseUri", "qxSDVejjiY");
        setField(term3156, term3156.getClass(), "parentNode", null);
        setIntField(term3156, term3156.getClass(), "siblingIndex", -556405712);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xBsXSDjXYK";
        callMethod(klass, "after", argTypes, term3156, args);
    }

};


