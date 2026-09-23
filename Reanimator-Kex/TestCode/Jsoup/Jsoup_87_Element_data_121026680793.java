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

public class Element_data_121026680793 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7192;

    public Element_data_121026680793() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7218 = new ArrayList();
        ((ArrayList) term7218).add((Object)null);
        ((ArrayList) term7218).add((Object)null);
        term7192 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7193 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7214 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term7215 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term7216 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term7222 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term7224 = (Object[]) newArray("java.lang.String", 0);
        Object[] term7225 = (Object[]) newArray("java.lang.String", 0);
        setField(term7193, term7193.getClass(), "tagName", "AHbZyFOmlo");
        setBooleanField(term7193, term7193.getClass(), "isBlock", false);
        setBooleanField(term7193, term7193.getClass(), "formatAsBlock", false);
        setBooleanField(term7193, term7193.getClass(), "canContainInline", true);
        setBooleanField(term7193, term7193.getClass(), "empty", false);
        setBooleanField(term7193, term7193.getClass(), "selfClosing", false);
        setBooleanField(term7193, term7193.getClass(), "preserveWhitespace", true);
        setBooleanField(term7193, term7193.getClass(), "formList", false);
        setBooleanField(term7193, term7193.getClass(), "formSubmit", true);
        setField(term7192, term7192.getClass(), "tag", term7193);
        setField(term7214, term7214.getClass(), "referent", null);
        setField(term7215, term7215.getClass(), "lock", term7216);
        setField(term7215, term7215.getClass(), "head", null);
        setLongField(term7215, term7215.getClass(), "queueLength", 4474998035090263139L);
        setField(term7214, term7214.getClass(), "queue", term7215);
        setField(term7214, term7214.getClass(), "next", null);
        setField(term7214, term7214.getClass(), "discovered", null);
        setField(term7192, term7192.getClass(), "shadowChildrenRef", term7214);
        setField(term7192, term7192.getClass(), "childNodes", term7218);
        setIntField(term7222, term7222.getClass(), "size", 1901317214);
        setField(term7222, term7222.getClass(), "keys", term7224);
        setField(term7222, term7222.getClass(), "vals", term7225);
        setField(term7192, term7192.getClass(), "attributes", term7222);
        setField(term7192, term7192.getClass(), "baseUri", "TwfWVQGiIj");
        setField(term7192, term7192.getClass(), "parentNode", null);
        setIntField(term7192, term7192.getClass(), "siblingIndex", 1166710220);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "data", argTypes, term7192, args);
    }

};


