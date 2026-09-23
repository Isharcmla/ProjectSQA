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

public class Element_val_205212752398 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7535;

    public Element_val_205212752398() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7561 = new ArrayList();
        term7535 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7536 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7557 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term7558 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term7559 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term7565 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term7567 = (Object[]) newArray("java.lang.String", 0);
        Object[] term7568 = (Object[]) newArray("java.lang.String", 0);
        setField(term7536, term7536.getClass(), "tagName", "iIRsCSYqXH");
        setBooleanField(term7536, term7536.getClass(), "isBlock", false);
        setBooleanField(term7536, term7536.getClass(), "formatAsBlock", true);
        setBooleanField(term7536, term7536.getClass(), "canContainInline", false);
        setBooleanField(term7536, term7536.getClass(), "empty", true);
        setBooleanField(term7536, term7536.getClass(), "selfClosing", false);
        setBooleanField(term7536, term7536.getClass(), "preserveWhitespace", false);
        setBooleanField(term7536, term7536.getClass(), "formList", false);
        setBooleanField(term7536, term7536.getClass(), "formSubmit", false);
        setField(term7535, term7535.getClass(), "tag", term7536);
        setField(term7557, term7557.getClass(), "referent", null);
        setField(term7558, term7558.getClass(), "lock", term7559);
        setField(term7558, term7558.getClass(), "head", null);
        setLongField(term7558, term7558.getClass(), "queueLength", 5836128569274066678L);
        setField(term7557, term7557.getClass(), "queue", term7558);
        setField(term7557, term7557.getClass(), "next", null);
        setField(term7557, term7557.getClass(), "discovered", null);
        setField(term7535, term7535.getClass(), "shadowChildrenRef", term7557);
        setField(term7535, term7535.getClass(), "childNodes", term7561);
        setIntField(term7565, term7565.getClass(), "size", -282881827);
        setField(term7565, term7565.getClass(), "keys", term7567);
        setField(term7565, term7565.getClass(), "vals", term7568);
        setField(term7535, term7535.getClass(), "attributes", term7565);
        setField(term7535, term7535.getClass(), "baseUri", "nghfqDXyCG");
        setField(term7535, term7535.getClass(), "parentNode", null);
        setIntField(term7535, term7535.getClass(), "siblingIndex", -1183353915);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "WBAOTqErtm";
        callMethod(klass, "val", argTypes, term7535, args);
    }

};


