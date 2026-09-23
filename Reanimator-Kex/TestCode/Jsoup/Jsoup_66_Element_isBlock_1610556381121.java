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
import static org.jsoup.nodes.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;

public class Element_isBlock_1610556381121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term847;
     Object term11170;

    public Element_isBlock_1610556381121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term873 = new ArrayList();
        ((ArrayList) term873).add((Object)null);
        ((ArrayList) term873).add((Object)null);
        ((ArrayList) term873).add((Object)null);
        ((ArrayList) term873).add((Object)null);
        ((ArrayList) term873).add((Object)null);
        ((ArrayList) term873).add((Object)null);
        term847 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term848 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term869 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term870 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term871 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term877 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term879 = (Object[]) newArray("java.lang.String", 0);
        Object[] term880 = (Object[]) newArray("java.lang.String", 0);
        setField(term848, term848.getClass(), "tagName", "OclPbYPkcH");
        setBooleanField(term848, term848.getClass(), "isBlock", true);
        setBooleanField(term848, term848.getClass(), "formatAsBlock", false);
        setBooleanField(term848, term848.getClass(), "canContainInline", true);
        setBooleanField(term848, term848.getClass(), "empty", true);
        setBooleanField(term848, term848.getClass(), "selfClosing", false);
        setBooleanField(term848, term848.getClass(), "preserveWhitespace", false);
        setBooleanField(term848, term848.getClass(), "formList", true);
        setBooleanField(term848, term848.getClass(), "formSubmit", true);
        setField(term847, term847.getClass(), "tag", term848);
        setField(term869, term869.getClass(), "referent", null);
        setField(term870, term870.getClass(), "lock", term871);
        setField(term870, term870.getClass(), "head", null);
        setLongField(term870, term870.getClass(), "queueLength", -2813493605142626659L);
        setField(term869, term869.getClass(), "queue", term870);
        setField(term869, term869.getClass(), "next", null);
        setField(term869, term869.getClass(), "discovered", null);
        setField(term847, term847.getClass(), "shadowChildrenRef", term869);
        setField(term847, term847.getClass(), "childNodes", term873);
        setIntField(term877, term877.getClass(), "size", -6029667);
        setField(term877, term877.getClass(), "keys", term879);
        setField(term877, term877.getClass(), "vals", term880);
        setField(term847, term847.getClass(), "attributes", term877);
        setField(term847, term847.getClass(), "baseUri", "IoAlmYsBwc");
        setField(term847, term847.getClass(), "parentNode", null);
        setIntField(term847, term847.getClass(), "siblingIndex", -2068769794);
        ArrayList term11177 = new ArrayList();
        ((ArrayList) term11177).add((Object)null);
        ((ArrayList) term11177).add((Object)null);
        ((ArrayList) term11177).add((Object)null);
        ((ArrayList) term11177).add((Object)null);
        ((ArrayList) term11177).add((Object)null);
        ((ArrayList) term11177).add((Object)null);
        term11170 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term11171 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term11174 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term11175 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term11176 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term11179 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term11180 = (Object[]) newArray("java.lang.String", 0);
        Object[] term11181 = (Object[]) newArray("java.lang.String", 0);
        setField(term11171, term11171.getClass(), "tagName", "OclPbYPkcH");
        setBooleanField(term11171, term11171.getClass(), "isBlock", true);
        setBooleanField(term11171, term11171.getClass(), "formatAsBlock", false);
        setBooleanField(term11171, term11171.getClass(), "canContainInline", true);
        setBooleanField(term11171, term11171.getClass(), "empty", true);
        setBooleanField(term11171, term11171.getClass(), "selfClosing", false);
        setBooleanField(term11171, term11171.getClass(), "preserveWhitespace", false);
        setBooleanField(term11171, term11171.getClass(), "formList", true);
        setBooleanField(term11171, term11171.getClass(), "formSubmit", true);
        setField(term11170, term11170.getClass(), "tag", term11171);
        setField(term11174, term11174.getClass(), "referent", null);
        setField(term11175, term11175.getClass(), "lock", term11176);
        setField(term11175, term11175.getClass(), "head", null);
        setLongField(term11175, term11175.getClass(), "queueLength", -2813493605142626659L);
        setField(term11174, term11174.getClass(), "queue", term11175);
        setField(term11174, term11174.getClass(), "next", null);
        setField(term11174, term11174.getClass(), "discovered", null);
        setField(term11170, term11170.getClass(), "shadowChildrenRef", term11174);
        setField(term11170, term11170.getClass(), "childNodes", term11177);
        setIntField(term11179, term11179.getClass(), "size", -6029667);
        setField(term11179, term11179.getClass(), "keys", term11180);
        setField(term11179, term11179.getClass(), "vals", term11181);
        setField(term11170, term11170.getClass(), "attributes", term11179);
        setField(term11170, term11170.getClass(), "baseUri", "IoAlmYsBwc");
        setField(term11170, term11170.getClass(), "parentNode", null);
        setIntField(term11170, term11170.getClass(), "siblingIndex", -2068769794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBlock", argTypes, term847, args);
        assertTrue(recursiveEquals(term847, term11170));
    }

};


