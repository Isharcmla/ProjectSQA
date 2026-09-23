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
import java.lang.NullPointerException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class Element_lastElementSibling_936429029162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3870;

    public Element_lastElementSibling_936429029162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3896 = new ArrayList();
        ((ArrayList) term3896).add((Object)null);
        ((ArrayList) term3896).add((Object)null);
        ((ArrayList) term3896).add((Object)null);
        ((ArrayList) term3896).add((Object)null);
        ((ArrayList) term3896).add((Object)null);
        term3870 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3871 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3892 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term3893 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term3894 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term3900 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term3902 = (Object[]) newArray("java.lang.String", 0);
        Object[] term3903 = (Object[]) newArray("java.lang.String", 0);
        setField(term3871, term3871.getClass(), "tagName", "JDaAnsVTGV");
        setBooleanField(term3871, term3871.getClass(), "isBlock", false);
        setBooleanField(term3871, term3871.getClass(), "formatAsBlock", false);
        setBooleanField(term3871, term3871.getClass(), "canContainInline", false);
        setBooleanField(term3871, term3871.getClass(), "empty", true);
        setBooleanField(term3871, term3871.getClass(), "selfClosing", true);
        setBooleanField(term3871, term3871.getClass(), "preserveWhitespace", false);
        setBooleanField(term3871, term3871.getClass(), "formList", true);
        setBooleanField(term3871, term3871.getClass(), "formSubmit", true);
        setField(term3870, term3870.getClass(), "tag", term3871);
        setField(term3892, term3892.getClass(), "referent", null);
        setField(term3893, term3893.getClass(), "lock", term3894);
        setField(term3893, term3893.getClass(), "head", null);
        setLongField(term3893, term3893.getClass(), "queueLength", -1154553077993834885L);
        setField(term3892, term3892.getClass(), "queue", term3893);
        setField(term3892, term3892.getClass(), "next", null);
        setField(term3892, term3892.getClass(), "discovered", null);
        setField(term3870, term3870.getClass(), "shadowChildrenRef", term3892);
        setField(term3870, term3870.getClass(), "childNodes", term3896);
        setIntField(term3900, term3900.getClass(), "size", -615654495);
        setField(term3900, term3900.getClass(), "keys", term3902);
        setField(term3900, term3900.getClass(), "vals", term3903);
        setField(term3870, term3870.getClass(), "attributes", term3900);
        setField(term3870, term3870.getClass(), "baseUri", "mLUZFTfjle");
        setField(term3870, term3870.getClass(), "parentNode", null);
        setIntField(term3870, term3870.getClass(), "siblingIndex", -1476117762);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "lastElementSibling", argTypes, term3870, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


