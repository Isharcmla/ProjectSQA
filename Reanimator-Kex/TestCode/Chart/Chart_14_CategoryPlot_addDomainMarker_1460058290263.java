package org.jfree.chart.plot;

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
import static org.jfree.chart.plot.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CategoryPlot_addDomainMarker_1460058290263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2578;
     Object term2623;

    public CategoryPlot_addDomainMarker_1460058290263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2578 = newInstance(Class.forName("org.jfree.chart.plot.CategoryMarker"));
        Object term2593 = newInstance(Class.forName("java.awt.Font"));
        Object term2594 = newInstance(Class.forName("java.util.Hashtable"));
        Object[] term2595 = (Object[]) newArray("java.util.Hashtable$Entry", 11);
        Object term2596 = newInstance(Class.forName("java.util.Hashtable$Entry"));
        setField(term2578, term2578.getClass(), "key", null);
        setBooleanField(term2578, term2578.getClass(), "drawAsLine", true);
        setField(term2578, term2578.getClass(), "paint", null);
        setField(term2578, term2578.getClass(), "stroke", null);
        setField(term2578, term2578.getClass(), "outlinePaint", null);
        setField(term2578, term2578.getClass(), "outlineStroke", null);
        setFloatField(term2578, term2578.getClass(), "alpha", 0.9472605F);
        setField(term2578, term2578.getClass(), "label", "jDtqGUpnZN");
        setIntField(term2596, term2596.getClass(), "hash", 1657101404);
        setField(term2596, term2596.getClass(), "key", null);
        setField(term2596, term2596.getClass(), "value", null);
        setField(term2596, term2596.getClass(), "next", null);
        setElement(term2595, 2, term2596);
        setField(term2594, term2594.getClass(), "table", term2595);
        setIntField(term2594, term2594.getClass(), "count", 1);
        setIntField(term2594, term2594.getClass(), "threshold", 8);
        setFloatField(term2594, term2594.getClass(), "loadFactor", 0.75F);
        setIntField(term2594, term2594.getClass(), "modCount", 1);
        setField(term2594, term2594.getClass(), "keySet", null);
        setField(term2594, term2594.getClass(), "entrySet", null);
        setField(term2594, term2594.getClass(), "values", null);
        setField(term2593, term2593.getClass(), "fRequestedAttributes", term2594);
        setField(term2593, term2593.getClass(), "name", "nGKItKLYNC");
        setIntField(term2593, term2593.getClass(), "style", -1530420153);
        setIntField(term2593, term2593.getClass(), "size", -469968304);
        setFloatField(term2593, term2593.getClass(), "pointSize", 0.27797186F);
        setField(term2593, term2593.getClass(), "peer", null);
        setLongField(term2593, term2593.getClass(), "pData", 0L);
        setField(term2593, term2593.getClass(), "font2DHandle", null);
        setField(term2593, term2593.getClass(), "values", null);
        setBooleanField(term2593, term2593.getClass(), "hasLayoutAttributes", false);
        setBooleanField(term2593, term2593.getClass(), "createdFont", false);
        setBooleanField(term2593, term2593.getClass(), "nonIdentityTx", false);
        setIntField(term2593, term2593.getClass(), "hash", 0);
        setIntField(term2593, term2593.getClass(), "fontSerializedDataVersion", 0);
        setField(term2593, term2593.getClass(), "flmref", null);
        setField(term2578, term2578.getClass(), "labelFont", term2593);
        setField(term2578, term2578.getClass(), "labelPaint", null);
        setField(term2578, term2578.getClass(), "labelAnchor", null);
        setField(term2578, term2578.getClass(), "labelTextAnchor", null);
        setField(term2578, term2578.getClass(), "labelOffset", null);
        setField(term2578, term2578.getClass(), "labelOffsetType", null);
        setField(term2578, term2578.getClass(), "listenerList", null);
        term2623 = newInstance(Class.forName("org.jfree.chart.util.Layer"));
        setField(term2623, term2623.getClass(), "name", "UiUYnPrcCi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.CategoryPlot");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jfree.chart.plot.CategoryMarker");
        argTypes[1] = Class.forName("org.jfree.chart.util.Layer");
        Object[] args = new Object[2];
        args[0] = term2578;
        args[1] = term2623;
        try {
            callMethod(klass, "addDomainMarker", argTypes, null, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


