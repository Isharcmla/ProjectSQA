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
import static org.jfree.chart.plot.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class MultiplePiePlot_getPieChart_12913324484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term339;

    public MultiplePiePlot_getPieChart_12913324484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term394 = new ArrayList();
        ArrayList term438 = new ArrayList();
        term339 = newInstance(Class.forName("org.jfree.chart.plot.MultiplePiePlot"));
        Object term340 = newInstance(Class.forName("org.jfree.chart.JFreeChart"));
        Object term341 = newInstance(Class.forName("java.awt.RenderingHints"));
        Object term343 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term344 = newInstance(Class.forName("org.jfree.chart.util.UnitType"));
        Object term350 = newInstance(Class.forName("org.jfree.chart.title.TextTitle"));
        Object term353 = newInstance(Class.forName("java.awt.Font"));
        Object term364 = newInstance(Class.forName("org.jfree.chart.util.HorizontalAlignment"));
        Object term366 = newInstance(Class.forName("java.awt.Color"));
        Object term393 = newInstance(Class.forName("org.jfree.chart.text.TextBlock"));
        Object term398 = newInstance(Class.forName("org.jfree.chart.util.RectangleEdge"));
        Object term400 = newInstance(Class.forName("org.jfree.chart.util.VerticalAlignment"));
        Object term402 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term403 = (Object[]) newArray("java.lang.Object", 0);
        Object term417 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term422 = newInstance(Class.forName("org.jfree.chart.block.BlockBorder"));
        Object term423 = newInstance(Class.forName("java.awt.Color"));
        Object term426 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term433 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Float"));
        Object term444 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term445 = (Object[]) newArray("java.lang.Object", 0);
        Object term446 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term447 = (Object[]) newArray("java.lang.Object", 0);
        Object term449 = newInstance(Class.forName("org.jfree.chart.util.TableOrder"));
        setField(term341, term341.getClass(), "hintmap", null);
        setField(term340, term340.getClass(), "renderingHints", term341);
        setBooleanField(term340, term340.getClass(), "borderVisible", true);
        setField(term340, term340.getClass(), "borderStroke", null);
        setField(term340, term340.getClass(), "borderPaint", null);
        setField(term344, term344.getClass(), "name", "");
        setField(term343, term343.getClass(), "unitType", term344);
        setDoubleField(term343, term343.getClass(), "top", 1.0);
        setDoubleField(term343, term343.getClass(), "left", 1.0);
        setDoubleField(term343, term343.getClass(), "bottom", 1.0);
        setDoubleField(term343, term343.getClass(), "right", 1.0);
        setField(term340, term340.getClass(), "padding", term343);
        setField(term350, term350.getClass(), "text", "");
        setField(term353, term353.getClass(), "fRequestedAttributes", null);
        setField(term353, term353.getClass(), "name", "");
        setIntField(term353, term353.getClass(), "style", 1);
        setIntField(term353, term353.getClass(), "size", 12);
        setFloatField(term353, term353.getClass(), "pointSize", 12.0F);
        setField(term353, term353.getClass(), "peer", null);
        setLongField(term353, term353.getClass(), "pData", 0L);
        setField(term353, term353.getClass(), "font2DHandle", null);
        setField(term353, term353.getClass(), "values", null);
        setBooleanField(term353, term353.getClass(), "hasLayoutAttributes", false);
        setBooleanField(term353, term353.getClass(), "createdFont", false);
        setBooleanField(term353, term353.getClass(), "nonIdentityTx", false);
        setIntField(term353, term353.getClass(), "hash", 0);
        setIntField(term353, term353.getClass(), "fontSerializedDataVersion", 1);
        setField(term353, term353.getClass(), "flmref", null);
        setField(term350, term350.getClass(), "font", term353);
        setField(term364, term364.getClass(), "name", "");
        setField(term350, term350.getClass(), "textAlignment", term364);
        setIntField(term366, term366.getClass(), "value", -16777216);
        setField(term366, term366.getClass(), "frgbvalue", null);
        setField(term366, term366.getClass(), "fvalue", null);
        setFloatField(term366, term366.getClass(), "falpha", 0.0F);
        setField(term366, term366.getClass(), "cs", null);
        setField(term350, term350.getClass(), "paint", term366);
        setField(term350, term350.getClass(), "backgroundPaint", null);
        setField(term350, term350.getClass(), "toolTipText", "hRNSzYYIrc");
        setField(term350, term350.getClass(), "urlText", "RMFIsYGgne");
        setField(term393, term393.getClass(), "lines", term394);
        setField(term393, term393.getClass(), "lineAlignment", term364);
        setField(term350, term350.getClass(), "content", term393);
        setBooleanField(term350, term350.getClass(), "expandToFitSpace", true);
        setField(term398, term398.getClass(), "name", "");
        setField(term350, term350.getClass(), "position", term398);
        setField(term350, term350.getClass(), "horizontalAlignment", term364);
        setField(term400, term400.getClass(), "name", "");
        setField(term350, term350.getClass(), "verticalAlignment", term400);
        setField(term402, term402.getClass(), "listenerList", term403);
        setField(term350, term350.getClass(), "listenerList", term402);
        setBooleanField(term350, term350.getClass(), "notify", true);
        setField(term350, term350.getClass(), "id", "NRdvgJlhkX");
        setField(term417, term417.getClass(), "unitType", term344);
        setDoubleField(term417, term417.getClass(), "top", 0.0);
        setDoubleField(term417, term417.getClass(), "left", 0.0);
        setDoubleField(term417, term417.getClass(), "bottom", 0.0);
        setDoubleField(term417, term417.getClass(), "right", 0.0);
        setField(term350, term350.getClass(), "margin", term417);
        setField(term422, term422.getClass(), "insets", term417);
        setIntField(term423, term423.getClass(), "value", -1);
        setField(term423, term423.getClass(), "frgbvalue", null);
        setField(term423, term423.getClass(), "fvalue", null);
        setFloatField(term423, term423.getClass(), "falpha", 0.0F);
        setField(term423, term423.getClass(), "cs", null);
        setField(term422, term422.getClass(), "paint", term423);
        setField(term350, term350.getClass(), "frame", term422);
        setField(term426, term426.getClass(), "unitType", term344);
        setDoubleField(term426, term426.getClass(), "top", 1.0);
        setDoubleField(term426, term426.getClass(), "left", 1.0);
        setDoubleField(term426, term426.getClass(), "bottom", 1.0);
        setDoubleField(term426, term426.getClass(), "right", 1.0);
        setField(term350, term350.getClass(), "padding", term426);
        setDoubleField(term350, term350.getClass(), "width", 0.2641345529914265);
        setDoubleField(term350, term350.getClass(), "height", 0.36923381893433327);
        setFloatField(term433, term433.getClass(), "x", 0.0F);
        setFloatField(term433, term433.getClass(), "y", 0.0F);
        setFloatField(term433, term433.getClass(), "width", 0.0F);
        setFloatField(term433, term433.getClass(), "height", 0.0F);
        setField(term350, term350.getClass(), "bounds", term433);
        setField(term340, term340.getClass(), "title", term350);
        setField(term340, term340.getClass(), "subtitles", term438);
        setField(term340, term340.getClass(), "plot", null);
        setField(term340, term340.getClass(), "backgroundPaint", null);
        setField(term340, term340.getClass(), "backgroundImage", null);
        setIntField(term340, term340.getClass(), "backgroundImageAlignment", 1484323161);
        setFloatField(term340, term340.getClass(), "backgroundImageAlpha", 0.3455959F);
        setField(term444, term444.getClass(), "listenerList", term445);
        setField(term340, term340.getClass(), "changeListeners", term444);
        setField(term446, term446.getClass(), "listenerList", term447);
        setField(term340, term340.getClass(), "progressListeners", term446);
        setBooleanField(term340, term340.getClass(), "notify", false);
        setField(term339, term339.getClass(), "pieChart", term340);
        setField(term339, term339.getClass(), "dataset", null);
        setField(term449, term449.getClass(), "name", "uuaPigETmJ");
        setField(term339, term339.getClass(), "dataExtractOrder", term449);
        setDoubleField(term339, term339.getClass(), "limit", 0.6076495596892013);
        setField(term339, term339.getClass(), "aggregatedItemsKey", null);
        setField(term339, term339.getClass(), "aggregatedItemsPaint", null);
        setField(term339, term339.getClass(), "sectionPaints", null);
        setField(term339, term339.getClass(), "parent", null);
        setField(term339, term339.getClass(), "datasetGroup", null);
        setField(term339, term339.getClass(), "noDataMessage", null);
        setField(term339, term339.getClass(), "noDataMessageFont", null);
        setField(term339, term339.getClass(), "noDataMessagePaint", null);
        setField(term339, term339.getClass(), "insets", null);
        setBooleanField(term339, term339.getClass(), "outlineVisible", false);
        setField(term339, term339.getClass(), "outlineStroke", null);
        setField(term339, term339.getClass(), "outlinePaint", null);
        setField(term339, term339.getClass(), "backgroundPaint", null);
        setField(term339, term339.getClass(), "backgroundImage", null);
        setIntField(term339, term339.getClass(), "backgroundImageAlignment", 0);
        setFloatField(term339, term339.getClass(), "backgroundImageAlpha", 0.0F);
        setFloatField(term339, term339.getClass(), "foregroundAlpha", 0.0F);
        setFloatField(term339, term339.getClass(), "backgroundAlpha", 0.0F);
        setField(term339, term339.getClass(), "drawingSupplier", null);
        setField(term339, term339.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.MultiplePiePlot");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPieChart", argTypes, term339, args);
    }

};


