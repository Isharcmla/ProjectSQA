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

public class MultiplePiePlot_getDataExtractOrder_15156206726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term781;

    public MultiplePiePlot_getDataExtractOrder_15156206726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term836 = new ArrayList();
        ArrayList term880 = new ArrayList();
        term781 = newInstance(Class.forName("org.jfree.chart.plot.MultiplePiePlot"));
        Object term782 = newInstance(Class.forName("org.jfree.chart.JFreeChart"));
        Object term783 = newInstance(Class.forName("java.awt.RenderingHints"));
        Object term785 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term786 = newInstance(Class.forName("org.jfree.chart.util.UnitType"));
        Object term792 = newInstance(Class.forName("org.jfree.chart.title.TextTitle"));
        Object term795 = newInstance(Class.forName("java.awt.Font"));
        Object term806 = newInstance(Class.forName("org.jfree.chart.util.HorizontalAlignment"));
        Object term808 = newInstance(Class.forName("java.awt.Color"));
        Object term835 = newInstance(Class.forName("org.jfree.chart.text.TextBlock"));
        Object term840 = newInstance(Class.forName("org.jfree.chart.util.RectangleEdge"));
        Object term842 = newInstance(Class.forName("org.jfree.chart.util.VerticalAlignment"));
        Object term844 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term845 = (Object[]) newArray("java.lang.Object", 0);
        Object term859 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term864 = newInstance(Class.forName("org.jfree.chart.block.BlockBorder"));
        Object term865 = newInstance(Class.forName("java.awt.Color"));
        Object term868 = newInstance(Class.forName("org.jfree.chart.util.RectangleInsets"));
        Object term875 = newInstance(Class.forName("java.awt.geom.Rectangle2D$Float"));
        Object term886 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term887 = (Object[]) newArray("java.lang.Object", 0);
        Object term888 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term889 = (Object[]) newArray("java.lang.Object", 0);
        Object term891 = newInstance(Class.forName("org.jfree.chart.util.TableOrder"));
        setField(term783, term783.getClass(), "hintmap", null);
        setField(term782, term782.getClass(), "renderingHints", term783);
        setBooleanField(term782, term782.getClass(), "borderVisible", false);
        setField(term782, term782.getClass(), "borderStroke", null);
        setField(term782, term782.getClass(), "borderPaint", null);
        setField(term786, term786.getClass(), "name", "");
        setField(term785, term785.getClass(), "unitType", term786);
        setDoubleField(term785, term785.getClass(), "top", 1.0);
        setDoubleField(term785, term785.getClass(), "left", 1.0);
        setDoubleField(term785, term785.getClass(), "bottom", 1.0);
        setDoubleField(term785, term785.getClass(), "right", 1.0);
        setField(term782, term782.getClass(), "padding", term785);
        setField(term792, term792.getClass(), "text", "");
        setField(term795, term795.getClass(), "fRequestedAttributes", null);
        setField(term795, term795.getClass(), "name", "");
        setIntField(term795, term795.getClass(), "style", 1);
        setIntField(term795, term795.getClass(), "size", 12);
        setFloatField(term795, term795.getClass(), "pointSize", 12.0F);
        setField(term795, term795.getClass(), "peer", null);
        setLongField(term795, term795.getClass(), "pData", 0L);
        setField(term795, term795.getClass(), "font2DHandle", null);
        setField(term795, term795.getClass(), "values", null);
        setBooleanField(term795, term795.getClass(), "hasLayoutAttributes", false);
        setBooleanField(term795, term795.getClass(), "createdFont", false);
        setBooleanField(term795, term795.getClass(), "nonIdentityTx", false);
        setIntField(term795, term795.getClass(), "hash", 0);
        setIntField(term795, term795.getClass(), "fontSerializedDataVersion", 1);
        setField(term795, term795.getClass(), "flmref", null);
        setField(term792, term792.getClass(), "font", term795);
        setField(term806, term806.getClass(), "name", "");
        setField(term792, term792.getClass(), "textAlignment", term806);
        setIntField(term808, term808.getClass(), "value", -16777216);
        setField(term808, term808.getClass(), "frgbvalue", null);
        setField(term808, term808.getClass(), "fvalue", null);
        setFloatField(term808, term808.getClass(), "falpha", 0.0F);
        setField(term808, term808.getClass(), "cs", null);
        setField(term792, term792.getClass(), "paint", term808);
        setField(term792, term792.getClass(), "backgroundPaint", null);
        setField(term792, term792.getClass(), "toolTipText", "pCTimMblYc");
        setField(term792, term792.getClass(), "urlText", "hNxWaHcfhY");
        setField(term835, term835.getClass(), "lines", term836);
        setField(term835, term835.getClass(), "lineAlignment", term806);
        setField(term792, term792.getClass(), "content", term835);
        setBooleanField(term792, term792.getClass(), "expandToFitSpace", true);
        setField(term840, term840.getClass(), "name", "");
        setField(term792, term792.getClass(), "position", term840);
        setField(term792, term792.getClass(), "horizontalAlignment", term806);
        setField(term842, term842.getClass(), "name", "");
        setField(term792, term792.getClass(), "verticalAlignment", term842);
        setField(term844, term844.getClass(), "listenerList", term845);
        setField(term792, term792.getClass(), "listenerList", term844);
        setBooleanField(term792, term792.getClass(), "notify", true);
        setField(term792, term792.getClass(), "id", "RkybSrpybU");
        setField(term859, term859.getClass(), "unitType", term786);
        setDoubleField(term859, term859.getClass(), "top", 0.0);
        setDoubleField(term859, term859.getClass(), "left", 0.0);
        setDoubleField(term859, term859.getClass(), "bottom", 0.0);
        setDoubleField(term859, term859.getClass(), "right", 0.0);
        setField(term792, term792.getClass(), "margin", term859);
        setField(term864, term864.getClass(), "insets", term859);
        setIntField(term865, term865.getClass(), "value", -1);
        setField(term865, term865.getClass(), "frgbvalue", null);
        setField(term865, term865.getClass(), "fvalue", null);
        setFloatField(term865, term865.getClass(), "falpha", 0.0F);
        setField(term865, term865.getClass(), "cs", null);
        setField(term864, term864.getClass(), "paint", term865);
        setField(term792, term792.getClass(), "frame", term864);
        setField(term868, term868.getClass(), "unitType", term786);
        setDoubleField(term868, term868.getClass(), "top", 1.0);
        setDoubleField(term868, term868.getClass(), "left", 1.0);
        setDoubleField(term868, term868.getClass(), "bottom", 1.0);
        setDoubleField(term868, term868.getClass(), "right", 1.0);
        setField(term792, term792.getClass(), "padding", term868);
        setDoubleField(term792, term792.getClass(), "width", 0.7031006357544823);
        setDoubleField(term792, term792.getClass(), "height", 0.9527281779865117);
        setFloatField(term875, term875.getClass(), "x", 0.0F);
        setFloatField(term875, term875.getClass(), "y", 0.0F);
        setFloatField(term875, term875.getClass(), "width", 0.0F);
        setFloatField(term875, term875.getClass(), "height", 0.0F);
        setField(term792, term792.getClass(), "bounds", term875);
        setField(term782, term782.getClass(), "title", term792);
        setField(term782, term782.getClass(), "subtitles", term880);
        setField(term782, term782.getClass(), "plot", null);
        setField(term782, term782.getClass(), "backgroundPaint", null);
        setField(term782, term782.getClass(), "backgroundImage", null);
        setIntField(term782, term782.getClass(), "backgroundImageAlignment", -616727354);
        setFloatField(term782, term782.getClass(), "backgroundImageAlpha", 0.8564069F);
        setField(term886, term886.getClass(), "listenerList", term887);
        setField(term782, term782.getClass(), "changeListeners", term886);
        setField(term888, term888.getClass(), "listenerList", term889);
        setField(term782, term782.getClass(), "progressListeners", term888);
        setBooleanField(term782, term782.getClass(), "notify", true);
        setField(term781, term781.getClass(), "pieChart", term782);
        setField(term781, term781.getClass(), "dataset", null);
        setField(term891, term891.getClass(), "name", "xOEqzGAmDU");
        setField(term781, term781.getClass(), "dataExtractOrder", term891);
        setDoubleField(term781, term781.getClass(), "limit", 0.9828442029246764);
        setField(term781, term781.getClass(), "aggregatedItemsKey", null);
        setField(term781, term781.getClass(), "aggregatedItemsPaint", null);
        setField(term781, term781.getClass(), "sectionPaints", null);
        setField(term781, term781.getClass(), "parent", null);
        setField(term781, term781.getClass(), "datasetGroup", null);
        setField(term781, term781.getClass(), "noDataMessage", null);
        setField(term781, term781.getClass(), "noDataMessageFont", null);
        setField(term781, term781.getClass(), "noDataMessagePaint", null);
        setField(term781, term781.getClass(), "insets", null);
        setBooleanField(term781, term781.getClass(), "outlineVisible", false);
        setField(term781, term781.getClass(), "outlineStroke", null);
        setField(term781, term781.getClass(), "outlinePaint", null);
        setField(term781, term781.getClass(), "backgroundPaint", null);
        setField(term781, term781.getClass(), "backgroundImage", null);
        setIntField(term781, term781.getClass(), "backgroundImageAlignment", 0);
        setFloatField(term781, term781.getClass(), "backgroundImageAlpha", 0.0F);
        setFloatField(term781, term781.getClass(), "foregroundAlpha", 0.0F);
        setFloatField(term781, term781.getClass(), "backgroundAlpha", 0.0F);
        setField(term781, term781.getClass(), "drawingSupplier", null);
        setField(term781, term781.getClass(), "listenerList", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.chart.plot.MultiplePiePlot");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDataExtractOrder", argTypes, term781, args);
    }

};


