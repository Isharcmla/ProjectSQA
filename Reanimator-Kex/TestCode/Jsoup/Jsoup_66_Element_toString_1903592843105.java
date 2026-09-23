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

public class Element_toString_1903592843105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9079;

    public Element_toString_1903592843105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term9105 = new ArrayList();
        ((ArrayList) term9105).add((Object)null);
        ((ArrayList) term9105).add((Object)null);
        ((ArrayList) term9105).add((Object)null);
        ((ArrayList) term9105).add((Object)null);
        term9079 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term9080 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term9101 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term9102 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term9103 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term9109 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term9111 = (Object[]) newArray("java.lang.String", 0);
        Object[] term9112 = (Object[]) newArray("java.lang.String", 0);
        setField(term9080, term9080.getClass(), "tagName", "lCyLIcSuom");
        setBooleanField(term9080, term9080.getClass(), "isBlock", true);
        setBooleanField(term9080, term9080.getClass(), "formatAsBlock", false);
        setBooleanField(term9080, term9080.getClass(), "canContainInline", false);
        setBooleanField(term9080, term9080.getClass(), "empty", true);
        setBooleanField(term9080, term9080.getClass(), "selfClosing", false);
        setBooleanField(term9080, term9080.getClass(), "preserveWhitespace", true);
        setBooleanField(term9080, term9080.getClass(), "formList", true);
        setBooleanField(term9080, term9080.getClass(), "formSubmit", false);
        setField(term9079, term9079.getClass(), "tag", term9080);
        setField(term9101, term9101.getClass(), "referent", null);
        setField(term9102, term9102.getClass(), "lock", term9103);
        setField(term9102, term9102.getClass(), "head", null);
        setLongField(term9102, term9102.getClass(), "queueLength", 1672578078364590450L);
        setField(term9101, term9101.getClass(), "queue", term9102);
        setField(term9101, term9101.getClass(), "next", null);
        setField(term9101, term9101.getClass(), "discovered", null);
        setField(term9079, term9079.getClass(), "shadowChildrenRef", term9101);
        setField(term9079, term9079.getClass(), "childNodes", term9105);
        setIntField(term9109, term9109.getClass(), "size", 306847454);
        setField(term9109, term9109.getClass(), "keys", term9111);
        setField(term9109, term9109.getClass(), "vals", term9112);
        setField(term9079, term9079.getClass(), "attributes", term9109);
        setField(term9079, term9079.getClass(), "baseUri", "CGOpQSZZwI");
        setField(term9079, term9079.getClass(), "parentNode", null);
        setIntField(term9079, term9079.getClass(), "siblingIndex", 1745276158);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term9079, args);
    }

};


