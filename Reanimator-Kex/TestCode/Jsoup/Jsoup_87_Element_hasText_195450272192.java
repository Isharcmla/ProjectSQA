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

public class Element_hasText_195450272192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7125;

    public Element_hasText_195450272192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7151 = new ArrayList();
        ((ArrayList) term7151).add((Object)null);
        ((ArrayList) term7151).add((Object)null);
        ((ArrayList) term7151).add((Object)null);
        ((ArrayList) term7151).add((Object)null);
        term7125 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7126 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7147 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term7148 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term7149 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term7155 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term7157 = (Object[]) newArray("java.lang.String", 0);
        Object[] term7158 = (Object[]) newArray("java.lang.String", 0);
        setField(term7126, term7126.getClass(), "tagName", "NzBMMhkhpT");
        setBooleanField(term7126, term7126.getClass(), "isBlock", true);
        setBooleanField(term7126, term7126.getClass(), "formatAsBlock", true);
        setBooleanField(term7126, term7126.getClass(), "canContainInline", true);
        setBooleanField(term7126, term7126.getClass(), "empty", false);
        setBooleanField(term7126, term7126.getClass(), "selfClosing", true);
        setBooleanField(term7126, term7126.getClass(), "preserveWhitespace", false);
        setBooleanField(term7126, term7126.getClass(), "formList", false);
        setBooleanField(term7126, term7126.getClass(), "formSubmit", false);
        setField(term7125, term7125.getClass(), "tag", term7126);
        setField(term7147, term7147.getClass(), "referent", null);
        setField(term7148, term7148.getClass(), "lock", term7149);
        setField(term7148, term7148.getClass(), "head", null);
        setLongField(term7148, term7148.getClass(), "queueLength", 2701184207686293431L);
        setField(term7147, term7147.getClass(), "queue", term7148);
        setField(term7147, term7147.getClass(), "next", null);
        setField(term7147, term7147.getClass(), "discovered", null);
        setField(term7125, term7125.getClass(), "shadowChildrenRef", term7147);
        setField(term7125, term7125.getClass(), "childNodes", term7151);
        setIntField(term7155, term7155.getClass(), "size", -1467089634);
        setField(term7155, term7155.getClass(), "keys", term7157);
        setField(term7155, term7155.getClass(), "vals", term7158);
        setField(term7125, term7125.getClass(), "attributes", term7155);
        setField(term7125, term7125.getClass(), "baseUri", "qCpEbQDHdF");
        setField(term7125, term7125.getClass(), "parentNode", null);
        setIntField(term7125, term7125.getClass(), "siblingIndex", 413548937);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasText", argTypes, term7125, args);
    }

};


