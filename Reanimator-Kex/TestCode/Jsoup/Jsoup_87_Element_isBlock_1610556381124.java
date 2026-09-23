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

public class Element_isBlock_1610556381124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term847;
     Object term58165;

    public Element_isBlock_1610556381124() {
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
        setBooleanField(term848, term848.getClass(), "formatAsBlock", true);
        setBooleanField(term848, term848.getClass(), "canContainInline", false);
        setBooleanField(term848, term848.getClass(), "empty", false);
        setBooleanField(term848, term848.getClass(), "selfClosing", true);
        setBooleanField(term848, term848.getClass(), "preserveWhitespace", true);
        setBooleanField(term848, term848.getClass(), "formList", true);
        setBooleanField(term848, term848.getClass(), "formSubmit", false);
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
        ArrayList term58172 = new ArrayList();
        ((ArrayList) term58172).add((Object)null);
        ((ArrayList) term58172).add((Object)null);
        ((ArrayList) term58172).add((Object)null);
        ((ArrayList) term58172).add((Object)null);
        ((ArrayList) term58172).add((Object)null);
        ((ArrayList) term58172).add((Object)null);
        term58165 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term58166 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term58169 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term58170 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term58171 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term58174 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term58175 = (Object[]) newArray("java.lang.String", 0);
        Object[] term58176 = (Object[]) newArray("java.lang.String", 0);
        setField(term58166, term58166.getClass(), "tagName", "OclPbYPkcH");
        setBooleanField(term58166, term58166.getClass(), "isBlock", true);
        setBooleanField(term58166, term58166.getClass(), "formatAsBlock", true);
        setBooleanField(term58166, term58166.getClass(), "canContainInline", false);
        setBooleanField(term58166, term58166.getClass(), "empty", false);
        setBooleanField(term58166, term58166.getClass(), "selfClosing", true);
        setBooleanField(term58166, term58166.getClass(), "preserveWhitespace", true);
        setBooleanField(term58166, term58166.getClass(), "formList", true);
        setBooleanField(term58166, term58166.getClass(), "formSubmit", false);
        setField(term58165, term58165.getClass(), "tag", term58166);
        setField(term58169, term58169.getClass(), "referent", null);
        setField(term58170, term58170.getClass(), "lock", term58171);
        setField(term58170, term58170.getClass(), "head", null);
        setLongField(term58170, term58170.getClass(), "queueLength", -2813493605142626659L);
        setField(term58169, term58169.getClass(), "queue", term58170);
        setField(term58169, term58169.getClass(), "next", null);
        setField(term58169, term58169.getClass(), "discovered", null);
        setField(term58165, term58165.getClass(), "shadowChildrenRef", term58169);
        setField(term58165, term58165.getClass(), "childNodes", term58172);
        setIntField(term58174, term58174.getClass(), "size", -6029667);
        setField(term58174, term58174.getClass(), "keys", term58175);
        setField(term58174, term58174.getClass(), "vals", term58176);
        setField(term58165, term58165.getClass(), "attributes", term58174);
        setField(term58165, term58165.getClass(), "baseUri", "IoAlmYsBwc");
        setField(term58165, term58165.getClass(), "parentNode", null);
        setIntField(term58165, term58165.getClass(), "siblingIndex", -2068769794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBlock", argTypes, term847, args);
        assertTrue(recursiveEquals(term847, term58165));
    }

};


