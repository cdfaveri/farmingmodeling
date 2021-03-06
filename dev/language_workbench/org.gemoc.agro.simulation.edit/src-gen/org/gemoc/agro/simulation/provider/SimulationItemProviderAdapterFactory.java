/**
 */
package org.gemoc.agro.simulation.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.gemoc.agro.simulation.util.SimulationAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SimulationItemProviderAdapterFactory extends SimulationAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
   * This keeps track of the root adapter factory that delegates to this adapter factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
   * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
   * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
   * This constructs an instance.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public SimulationItemProviderAdapterFactory() {
    supportedTypes.add(IEditingDomainItemProvider.class);
    supportedTypes.add(IStructuredItemContentProvider.class);
    supportedTypes.add(ITreeItemContentProvider.class);
    supportedTypes.add(IItemLabelProvider.class);
    supportedTypes.add(IItemPropertySource.class);
  }

	/**
   * This keeps track of the one adapter used for all {@link org.gemoc.agro.simulation.Schedule} instances.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ScheduleItemProvider scheduleItemProvider;

	/**
   * This creates an adapter for a {@link org.gemoc.agro.simulation.Schedule}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Adapter createScheduleAdapter() {
    if (scheduleItemProvider == null) {
      scheduleItemProvider = new ScheduleItemProvider(this);
    }

    return scheduleItemProvider;
  }

	/**
   * This keeps track of the one adapter used for all {@link org.gemoc.agro.simulation.ActivityWork} instances.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ActivityWorkItemProvider activityWorkItemProvider;

	/**
   * This creates an adapter for a {@link org.gemoc.agro.simulation.ActivityWork}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Adapter createActivityWorkAdapter() {
    if (activityWorkItemProvider == null) {
      activityWorkItemProvider = new ActivityWorkItemProvider(this);
    }

    return activityWorkItemProvider;
  }

	/**
   * This keeps track of the one adapter used for all {@link org.gemoc.agro.simulation.Day} instances.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected DayItemProvider dayItemProvider;

	/**
   * This creates an adapter for a {@link org.gemoc.agro.simulation.Day}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Adapter createDayAdapter() {
    if (dayItemProvider == null) {
      dayItemProvider = new DayItemProvider(this);
    }

    return dayItemProvider;
  }

	/**
   * This keeps track of the one adapter used for all {@link org.gemoc.agro.simulation.ClimateData} instances.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ClimateDataItemProvider climateDataItemProvider;

	/**
   * This creates an adapter for a {@link org.gemoc.agro.simulation.ClimateData}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Adapter createClimateDataAdapter() {
    if (climateDataItemProvider == null) {
      climateDataItemProvider = new ClimateDataItemProvider(this);
    }

    return climateDataItemProvider;
  }

	/**
   * This keeps track of the one adapter used for all {@link org.gemoc.agro.simulation.SchedulingFeedback} instances.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected SchedulingFeedbackItemProvider schedulingFeedbackItemProvider;

	/**
   * This creates an adapter for a {@link org.gemoc.agro.simulation.SchedulingFeedback}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Adapter createSchedulingFeedbackAdapter() {
    if (schedulingFeedbackItemProvider == null) {
      schedulingFeedbackItemProvider = new SchedulingFeedbackItemProvider(this);
    }

    return schedulingFeedbackItemProvider;
  }

	/**
   * This keeps track of the one adapter used for all {@link org.gemoc.agro.simulation.ResourceAllocation} instances.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ResourceAllocationItemProvider resourceAllocationItemProvider;

	/**
   * This creates an adapter for a {@link org.gemoc.agro.simulation.ResourceAllocation}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Adapter createResourceAllocationAdapter() {
    if (resourceAllocationItemProvider == null) {
      resourceAllocationItemProvider = new ResourceAllocationItemProvider(this);
    }

    return resourceAllocationItemProvider;
  }

	/**
   * This returns the root adapter factory that contains this factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ComposeableAdapterFactory getRootAdapterFactory() {
    return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
  }

	/**
   * This sets the composed adapter factory that contains this factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
    this.parentAdapterFactory = parentAdapterFactory;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean isFactoryForType(Object type) {
    return supportedTypes.contains(type) || super.isFactoryForType(type);
  }

	/**
   * This implementation substitutes the factory itself as the key for the adapter.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
    return super.adapt(notifier, this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object adapt(Object object, Object type) {
    if (isFactoryForType(type)) {
      Object adapter = super.adapt(object, type);
      if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
        return adapter;
      }
    }

    return null;
  }

	/**
   * This adds a listener.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void addListener(INotifyChangedListener notifyChangedListener) {
    changeNotifier.addListener(notifyChangedListener);
  }

	/**
   * This removes a listener.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
    changeNotifier.removeListener(notifyChangedListener);
  }

	/**
   * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void fireNotifyChanged(Notification notification) {
    changeNotifier.fireNotifyChanged(notification);

    if (parentAdapterFactory != null) {
      parentAdapterFactory.fireNotifyChanged(notification);
    }
  }

	/**
   * This disposes all of the item providers created by this factory. 
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void dispose() {
    if (scheduleItemProvider != null) scheduleItemProvider.dispose();
    if (activityWorkItemProvider != null) activityWorkItemProvider.dispose();
    if (dayItemProvider != null) dayItemProvider.dispose();
    if (climateDataItemProvider != null) climateDataItemProvider.dispose();
    if (schedulingFeedbackItemProvider != null) schedulingFeedbackItemProvider.dispose();
    if (resourceAllocationItemProvider != null) resourceAllocationItemProvider.dispose();
  }

}
