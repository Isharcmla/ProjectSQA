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

public class Element_text_125384701791 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7036;

    public Element_text_125384701791() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7062 = new ArrayList();
        ((ArrayList) term7062).add((Object)null);
        ((ArrayList) term7062).add((Object)null);
        ((ArrayList) term7062).add((Object)null);
        ((ArrayList) term7062).add((Object)null);
        ((ArrayList) term7062).add((Object)null);
        ((ArrayList) term7062).add((Object)null);
        ((ArrayList) term7062).add((Object)null);
        term7036 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7037 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7058 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term7059 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term7060 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term7066 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term7068 = (Object[]) newArray("java.lang.String", 0);
        Object[] term7069 = (Object[]) newArray("java.lang.String", 0);
        setField(term7037, term7037.getClass(), "tagName", "OIHoJeysUi");
        setBooleanField(term7037, term7037.getClass(), "isBlock", true);
        setBooleanField(term7037, term7037.getClass(), "formatAsBlock", true);
        setBooleanField(term7037, term7037.getClass(), "canContainInline", false);
        setBooleanField(term7037, term7037.getClass(), "empty", true);
        setBooleanField(term7037, term7037.getClass(), "selfClosing", false);
        setBooleanField(term7037, term7037.getClass(), "preserveWhitespace", false);
        setBooleanField(term7037, term7037.getClass(), "formList", true);
        setBooleanField(term7037, term7037.getClass(), "formSubmit", false);
        setField(term7036, term7036.getClass(), "tag", term7037);
        setField(term7058, term7058.getClass(), "referent", null);
        setField(term7059, term7059.getClass(), "lock", term7060);
        setField(term7059, term7059.getClass(), "head", null);
        setLongField(term7059, term7059.getClass(), "queueLength", -8652538484981166496L);
        setField(term7058, term7058.getClass(), "queue", term7059);
        setField(term7058, term7058.getClass(), "next", null);
        setField(term7058, term7058.getClass(), "discovered", null);
        setField(term7036, term7036.getClass(), "shadowChildrenRef", term7058);
        setField(term7036, term7036.getClass(), "childNodes", term7062);
        setIntField(term7066, term7066.getClass(), "size", -1533843432);
        setField(term7066, term7066.getClass(), "keys", term7068);
        setField(term7066, term7066.getClass(), "vals", term7069);
        setField(term7036, term7036.getClass(), "attributes", term7066);
        setField(term7036, term7036.getClass(), "baseUri", "WXMWFDGcLB");
        setField(term7036, term7036.getClass(), "parentNode", null);
        setIntField(term7036, term7036.getClass(), "siblingIndex", -123338791);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "wKWbJssZuG";
        callMethod(klass, "text", argTypes, term7036, args);
    }

};


