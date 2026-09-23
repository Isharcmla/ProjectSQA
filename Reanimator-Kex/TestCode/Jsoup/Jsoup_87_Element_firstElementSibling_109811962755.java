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

public class Element_firstElementSibling_109811962755 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3939;

    public Element_firstElementSibling_109811962755() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3965 = new ArrayList();
        term3939 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3940 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3961 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term3962 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term3963 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term3969 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term3971 = (Object[]) newArray("java.lang.String", 0);
        Object[] term3972 = (Object[]) newArray("java.lang.String", 0);
        setField(term3940, term3940.getClass(), "tagName", "xIeFjkHkOe");
        setBooleanField(term3940, term3940.getClass(), "isBlock", false);
        setBooleanField(term3940, term3940.getClass(), "formatAsBlock", false);
        setBooleanField(term3940, term3940.getClass(), "canContainInline", false);
        setBooleanField(term3940, term3940.getClass(), "empty", true);
        setBooleanField(term3940, term3940.getClass(), "selfClosing", false);
        setBooleanField(term3940, term3940.getClass(), "preserveWhitespace", false);
        setBooleanField(term3940, term3940.getClass(), "formList", true);
        setBooleanField(term3940, term3940.getClass(), "formSubmit", true);
        setField(term3939, term3939.getClass(), "tag", term3940);
        setField(term3961, term3961.getClass(), "referent", null);
        setField(term3962, term3962.getClass(), "lock", term3963);
        setField(term3962, term3962.getClass(), "head", null);
        setLongField(term3962, term3962.getClass(), "queueLength", -2850532706972744550L);
        setField(term3961, term3961.getClass(), "queue", term3962);
        setField(term3961, term3961.getClass(), "next", null);
        setField(term3961, term3961.getClass(), "discovered", null);
        setField(term3939, term3939.getClass(), "shadowChildrenRef", term3961);
        setField(term3939, term3939.getClass(), "childNodes", term3965);
        setIntField(term3969, term3969.getClass(), "size", -341962980);
        setField(term3969, term3969.getClass(), "keys", term3971);
        setField(term3969, term3969.getClass(), "vals", term3972);
        setField(term3939, term3939.getClass(), "attributes", term3969);
        setField(term3939, term3939.getClass(), "baseUri", "SdCKLMIYnX");
        setField(term3939, term3939.getClass(), "parentNode", null);
        setIntField(term3939, term3939.getClass(), "siblingIndex", 1532716628);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "firstElementSibling", argTypes, term3939, args);
    }

};


