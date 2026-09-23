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

public class Element_isBlock_1610556381122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term847;
     Object term57594;

    public Element_isBlock_1610556381122() {
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
        ArrayList term57601 = new ArrayList();
        ((ArrayList) term57601).add((Object)null);
        ((ArrayList) term57601).add((Object)null);
        ((ArrayList) term57601).add((Object)null);
        ((ArrayList) term57601).add((Object)null);
        ((ArrayList) term57601).add((Object)null);
        ((ArrayList) term57601).add((Object)null);
        term57594 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term57595 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term57598 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term57599 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term57600 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term57603 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term57604 = (Object[]) newArray("java.lang.String", 0);
        Object[] term57605 = (Object[]) newArray("java.lang.String", 0);
        setField(term57595, term57595.getClass(), "tagName", "OclPbYPkcH");
        setBooleanField(term57595, term57595.getClass(), "isBlock", true);
        setBooleanField(term57595, term57595.getClass(), "formatAsBlock", false);
        setBooleanField(term57595, term57595.getClass(), "canContainInline", true);
        setBooleanField(term57595, term57595.getClass(), "empty", true);
        setBooleanField(term57595, term57595.getClass(), "selfClosing", false);
        setBooleanField(term57595, term57595.getClass(), "preserveWhitespace", false);
        setBooleanField(term57595, term57595.getClass(), "formList", true);
        setBooleanField(term57595, term57595.getClass(), "formSubmit", true);
        setField(term57594, term57594.getClass(), "tag", term57595);
        setField(term57598, term57598.getClass(), "referent", null);
        setField(term57599, term57599.getClass(), "lock", term57600);
        setField(term57599, term57599.getClass(), "head", null);
        setLongField(term57599, term57599.getClass(), "queueLength", -2813493605142626659L);
        setField(term57598, term57598.getClass(), "queue", term57599);
        setField(term57598, term57598.getClass(), "next", null);
        setField(term57598, term57598.getClass(), "discovered", null);
        setField(term57594, term57594.getClass(), "shadowChildrenRef", term57598);
        setField(term57594, term57594.getClass(), "childNodes", term57601);
        setIntField(term57603, term57603.getClass(), "size", -6029667);
        setField(term57603, term57603.getClass(), "keys", term57604);
        setField(term57603, term57603.getClass(), "vals", term57605);
        setField(term57594, term57594.getClass(), "attributes", term57603);
        setField(term57594, term57594.getClass(), "baseUri", "IoAlmYsBwc");
        setField(term57594, term57594.getClass(), "parentNode", null);
        setIntField(term57594, term57594.getClass(), "siblingIndex", -2068769794);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBlock", argTypes, term847, args);
        assertTrue(recursiveEquals(term847, term57594));
    }

};


