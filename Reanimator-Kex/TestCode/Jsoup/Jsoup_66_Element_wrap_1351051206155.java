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
import java.lang.NoClassDefFoundError;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class Element_wrap_1351051206155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3379;

    public Element_wrap_1351051206155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3405 = new ArrayList();
        ((ArrayList) term3405).add((Object)null);
        ((ArrayList) term3405).add((Object)null);
        ((ArrayList) term3405).add((Object)null);
        ((ArrayList) term3405).add((Object)null);
        ((ArrayList) term3405).add((Object)null);
        ((ArrayList) term3405).add((Object)null);
        term3379 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3380 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3401 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term3402 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term3403 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term3409 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term3411 = (Object[]) newArray("java.lang.String", 0);
        Object[] term3412 = (Object[]) newArray("java.lang.String", 0);
        setField(term3380, term3380.getClass(), "tagName", "SJiQaLvSKv");
        setBooleanField(term3380, term3380.getClass(), "isBlock", true);
        setBooleanField(term3380, term3380.getClass(), "formatAsBlock", false);
        setBooleanField(term3380, term3380.getClass(), "canContainInline", false);
        setBooleanField(term3380, term3380.getClass(), "empty", false);
        setBooleanField(term3380, term3380.getClass(), "selfClosing", false);
        setBooleanField(term3380, term3380.getClass(), "preserveWhitespace", true);
        setBooleanField(term3380, term3380.getClass(), "formList", true);
        setBooleanField(term3380, term3380.getClass(), "formSubmit", false);
        setField(term3379, term3379.getClass(), "tag", term3380);
        setField(term3401, term3401.getClass(), "referent", null);
        setField(term3402, term3402.getClass(), "lock", term3403);
        setField(term3402, term3402.getClass(), "head", null);
        setLongField(term3402, term3402.getClass(), "queueLength", -7612550318181586304L);
        setField(term3401, term3401.getClass(), "queue", term3402);
        setField(term3401, term3401.getClass(), "next", null);
        setField(term3401, term3401.getClass(), "discovered", null);
        setField(term3379, term3379.getClass(), "shadowChildrenRef", term3401);
        setField(term3379, term3379.getClass(), "childNodes", term3405);
        setIntField(term3409, term3409.getClass(), "size", 941650513);
        setField(term3409, term3409.getClass(), "keys", term3411);
        setField(term3409, term3409.getClass(), "vals", term3412);
        setField(term3379, term3379.getClass(), "attributes", term3409);
        setField(term3379, term3379.getClass(), "baseUri", "OEXDRUKcFl");
        setField(term3379, term3379.getClass(), "parentNode", null);
        setIntField(term3379, term3379.getClass(), "siblingIndex", 444029505);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RYdKCNNMBR";
        try {
            callMethod(klass, "wrap", argTypes, term3379, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


