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

public class Element_html_1078401270101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55110;

    public Element_html_1078401270101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term55136 = new ArrayList();
        ((ArrayList) term55136).add((Object)null);
        ((ArrayList) term55136).add((Object)null);
        ((ArrayList) term55136).add((Object)null);
        term55110 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term55111 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term55132 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term55133 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term55134 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term55140 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term55142 = (Object[]) newArray("java.lang.String", 0);
        Object[] term55143 = (Object[]) newArray("java.lang.String", 0);
        setField(term55111, term55111.getClass(), "tagName", "NTlKJDDWlk");
        setBooleanField(term55111, term55111.getClass(), "isBlock", false);
        setBooleanField(term55111, term55111.getClass(), "formatAsBlock", true);
        setBooleanField(term55111, term55111.getClass(), "canContainInline", false);
        setBooleanField(term55111, term55111.getClass(), "empty", false);
        setBooleanField(term55111, term55111.getClass(), "selfClosing", false);
        setBooleanField(term55111, term55111.getClass(), "preserveWhitespace", false);
        setBooleanField(term55111, term55111.getClass(), "formList", false);
        setBooleanField(term55111, term55111.getClass(), "formSubmit", false);
        setField(term55110, term55110.getClass(), "tag", term55111);
        setField(term55132, term55132.getClass(), "referent", null);
        setField(term55133, term55133.getClass(), "lock", term55134);
        setField(term55133, term55133.getClass(), "head", null);
        setLongField(term55133, term55133.getClass(), "queueLength", 3133860696238261492L);
        setField(term55132, term55132.getClass(), "queue", term55133);
        setField(term55132, term55132.getClass(), "next", null);
        setField(term55132, term55132.getClass(), "discovered", null);
        setField(term55110, term55110.getClass(), "shadowChildrenRef", term55132);
        setField(term55110, term55110.getClass(), "childNodes", term55136);
        setIntField(term55140, term55140.getClass(), "size", 34470066);
        setField(term55140, term55140.getClass(), "keys", term55142);
        setField(term55140, term55140.getClass(), "vals", term55143);
        setField(term55110, term55110.getClass(), "attributes", term55140);
        setField(term55110, term55110.getClass(), "baseUri", "vOuMEpOQAg");
        setField(term55110, term55110.getClass(), "parentNode", null);
        setIntField(term55110, term55110.getClass(), "siblingIndex", 2058711405);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "html", argTypes, term55110, args);
    }

};


